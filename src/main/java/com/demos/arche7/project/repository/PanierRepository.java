package com.demos.arche7.project.repository;

import com.demos.arche7.project.model.Article;
import com.demos.arche7.project.model.Panier;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PanierRepository extends CrudRepository<Panier, Long> {

}
