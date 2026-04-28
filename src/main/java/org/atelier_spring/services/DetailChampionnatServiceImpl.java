package org.atelier_spring.services;


import lombok.AllArgsConstructor;
import org.atelier_spring.entities.Championnat;
import org.atelier_spring.entities.DetailChampionnat;
import org.atelier_spring.repositories.ChampionnatRepository;
import org.atelier_spring.repositories.IDetailChampionnatRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DetailChampionnatServiceImpl  implements IDetailChampionnatService{

    IDetailChampionnatRepository detailChampionnatRepository;
    private final ChampionnatRepository championnatRepo;

    @Override
    public DetailChampionnat ajouterEtAffecterDetailChampionnat(DetailChampionnat dc, Long idCh) {
        Championnat c=championnatRepo.findById(idCh).get();
        DetailChampionnat dtch=detailChampionnatRepository.save(dc);
        c.setDetailChampionnatchampionnat(dtch);
        championnatRepo.save(c);
        return  dtch;
    }
}
