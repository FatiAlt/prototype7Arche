package com.demos.arche7.project.service.Auteur;

import com.demos.arche7.project.model.Auteur;

import java.util.List;

public interface AuteurService {
    Iterable<Auteur> getAllAuteurs();

    Auteur saveAuteur(Auteur auteur);

    List<Auteur> findByNom(String nom);

    List<Auteur> findByPrenom(String prenom);


}
