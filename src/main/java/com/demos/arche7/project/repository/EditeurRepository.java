package com.demos.arche7.project.repository;

import com.demos.arche7.project.model.Editeur;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EditeurRepository extends CrudRepository <Editeur, Long>{


    List<Editeur> findByNomEditeur(String nomEditeur);



}
