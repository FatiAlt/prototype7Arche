package com.demos.arche7.project.service.Commande;

import com.demos.arche7.project.model.Commande;

public interface CommandeService {
    Iterable<Commande> getAllCommandes();

    Commande saveCommande(Commande commande);

}
