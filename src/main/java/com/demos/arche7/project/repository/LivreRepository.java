package com.demos.arche7.project.repository;

import com.demos.arche7.project.model.Livre;
import org.springframework.data.repository.CrudRepository;


import java.util.List;
public interface LivreRepository extends CrudRepository<Livre, Long>{
    List<Livre> findByTitre (String titre);


}


