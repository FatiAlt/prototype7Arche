package com.demos.arche7.project.repository;

import com.demos.arche7.project.model.Auteur;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuteurRepository extends CrudRepository<Auteur, Long> {
    List<Auteur> findByNom(String nom);

    List<Auteur> findByPrenom(String prenom);
}
