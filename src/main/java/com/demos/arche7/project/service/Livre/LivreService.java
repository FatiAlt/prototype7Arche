package com.demos.arche7.project.service.Livre;

import com.demos.arche7.project.model.Livre;

import java.util.List;
import java.util.Optional;

public interface LivreService {
    Iterable<Livre> getAllLivres();

    Livre saveLivre(Livre livre);

    List<Livre> findByTitre(String titre);

    Optional<Livre> findById(Long id);
    //déclarer les méthodes suivant les requêtes dans le controller
}
