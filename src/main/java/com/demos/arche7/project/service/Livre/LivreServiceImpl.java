package com.demos.arche7.project.service.Livre;

import com.demos.arche7.project.model.Livre;
import com.demos.arche7.project.repository.LivreRepository;

public class LivreServiceImpl implements LivreService {

    //Implementer les méthodes suivant l'interface

    private LivreRepository livreRepository;

    /**
     * @return
     */
    @Override
    public Iterable<Livre> getAllLivres() {
        return livreRepository.findAll();
    }

    @Override
    public Livre saveLivre(Livre livre) {
        return livreRepository.save(livre);
    }
}
