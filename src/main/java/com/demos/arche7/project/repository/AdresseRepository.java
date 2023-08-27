package com.demos.arche7.project.repository;

import com.demos.arche7.project.model.Adresse;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AdresseRepository extends CrudRepository<Adresse, Long> {

    Adresse save(Adresse adresse);

    void deleteById(Long id);

    Optional<Adresse> findById(Long id);

}

