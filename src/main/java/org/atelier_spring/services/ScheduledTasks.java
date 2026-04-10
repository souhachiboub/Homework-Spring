package org.atelier_spring.services;

import lombok.RequiredArgsConstructor;
import org.atelier_spring.entities.Contrat;
import org.atelier_spring.entities.Sponsor;
import org.atelier_spring.repositories.IContractRepository;
import org.atelier_spring.repositories.SponsorRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ScheduledTasks {

    private final IContractRepository contratRepository;
    private final SponsorRepository sponsorRepository;
    @Scheduled(fixedRate = 30000)
    public void archiverContratsExpireesEtAffichageContratsActifsParEquipe() {
        int currentYear = LocalDate.now().getYear();


        List<Contrat> contrats = contratRepository.findAll();


        for (Contrat c : contrats) {
            try {
                int anneeContrat = Integer.parseInt(c.getAnnee());

                if (anneeContrat < currentYear && !c.isArchived()) {
                    c.setArchived(true);
                    contratRepository.save(c);
                }

            } catch (Exception e) {
                System.out.println("Erreur conversion année pour contrat ID: " + c.getIdContract());
            }
        }


        List<Contrat> activeContrats = contratRepository.findByArchivedFalse();


        System.out.println("===== Contrats actifs par équipe =====");


        activeContrats.stream()
                .collect(Collectors.groupingBy(c -> c.getEquipe().getLibelle()))
                .forEach((equipe, contratsList) -> {

                    System.out.println("Equipe: " + equipe);

                    contratsList.forEach(c -> {
                        System.out.println(" - Contrat ID: " + c.getIdContract()
                                + " | Sponsor: " + c.getSponsor().getNom()
                                + " | Montant: " + c.getMontant()
                                + " | Année: " + c.getAnnee());
                    });
                });

        System.out.println("======================================");
    }

    @Scheduled(cron = "0 0 9 ? * MON")
    public void verifierBudgetSponsors() {

        System.out.println("===== Vérification budget sponsors =====");

        List<Sponsor> sponsors = sponsorRepository.findAll();

        for (Sponsor s : sponsors) {

            // 1️⃣ Call your previous method (IMPORTANT)
            Float pourcentage = pourcentageBudgetAnnuelConsomme(s.getIdSponsor());

            if (pourcentage == null) continue;

            System.out.println("Sponsor: " + s.getNom() + " -> " + pourcentage + " %");

            // 2️⃣ Conditions
            if (pourcentage > 70 && pourcentage < 100) {
                System.out.println("attention budget presque consommé : " + pourcentage + " % !");
            }

            if (pourcentage > 100) {
                System.out.println(" budget dépassé!! vous ne pouvez plus faire de contrats");

                // 3️⃣ Block sponsor
                s.setArchived(true);
                sponsorRepository.save(s);
            }
        }

        System.out.println("========================================");
    }


    public Float pourcentageBudgetAnnuelConsomme(Long idSponsor) {

        Sponsor sponsor = sponsorRepository.findById(idSponsor).orElse(null);
        if (sponsor == null) return 0f;

        int currentYear = LocalDate.now().getYear();

        // total spent this year
        float totalContrats = sponsor.getContrats().stream()
                .filter(c -> Integer.parseInt(c.getAnnee()) == currentYear)
                .map(Contrat::getMontant)
                .reduce(0f, Float::sum);

        // budget annuel
        float budget = sponsor.getBudgetAnnuel();

        if (budget == 0) return 0f;

        return (totalContrats / budget) * 100;
    }
}
