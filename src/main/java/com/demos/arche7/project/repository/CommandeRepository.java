package com.demos.arche7.project.repository;

import com.demos.arche7.project.model.Article;
import com.demos.arche7.project.model.Commande;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CommandeRepository extends CrudRepository<Commande,Long> {
    //Commande findCommandeById(Long Id);

    Optional<Article> findById(int i);
}
