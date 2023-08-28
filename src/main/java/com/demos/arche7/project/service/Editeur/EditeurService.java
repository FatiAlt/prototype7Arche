package com.demos.arche7.project.service.Editeur;

import com.demos.arche7.project.model.Editeur;

import java.util.List;
//toutes les methodes de cette classe sont implentées
public interface EditeurService {
    Iterable<Editeur> getAllEditeurs();

    Editeur saveEditeur(Editeur editeur);

    List<Editeur> findByNomEditeur(String nomEditeur);

}
