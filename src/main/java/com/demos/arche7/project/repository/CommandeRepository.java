package com.demos.arche7.project.repository;

import com.demos.arche7.project.model.Commande;
import org.springframework.data.repository.CrudRepository;

public interface CommandeRepository extends CrudRepository<Commande,Long> {
    Commande findCommandeById(Long Id);

}
