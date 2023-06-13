package com.demos.arche7.project.service.Livre;

import com.demos.arche7.project.model.Livre;
import com.demos.arche7.project.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LivreServiceImpl implements LivreService {

    //Implementer les méthodes suivant l'interface
    @Autowired
    private LivreRepository livreRepository;

    @Override
    public Iterable<Livre> getAllLivres() {
        return livreRepository.findAll();
    }

    @Override
    public Livre saveLivre(Livre livre) {
        return livreRepository.save(livre);
    }

    @Override
    public List<Livre> findByTitre(String titre) {
        return livreRepository.findByTitre(titre);
    }
}
