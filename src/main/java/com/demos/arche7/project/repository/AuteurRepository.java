package com.demos.arche7.project.repository;

import com.demos.arche7.project.model.Auteur;
import org.springframework.data.repository.CrudRepository;

public interface AuteurRepository extends CrudRepository<Auteur, Long> {

    //Iterable<Auteur> getAllAuteurs();
}
