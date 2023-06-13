package com.demos.arche7.project.service.Livre;

import com.demos.arche7.project.model.Livre;

import java.util.List;

public interface LivreService {
    Iterable<Livre> getAllLivres();

    Livre saveLivre(Livre livre);

    List<Livre> findByTitre(String titre);
    //déclarer les méthodes suivant les requêtes dans le controller
}
