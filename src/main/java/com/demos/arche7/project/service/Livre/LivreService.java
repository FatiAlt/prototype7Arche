package com.demos.arche7.project.service.Livre;

import com.demos.arche7.project.model.Livre;

public interface LivreService {
    Iterable<Livre> getAllLivres();

    Livre saveLivre(Livre livre);
    //déclarer les méthodes suivant les requêtes dans le controller
}
