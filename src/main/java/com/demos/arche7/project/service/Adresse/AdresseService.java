package com.demos.arche7.project.service.Adresse;

import com.demos.arche7.project.model.Adresse;

import java.util.Optional;

public interface AdresseService {
    Iterable<Adresse> getAllAdresse();

    Optional<Adresse> findById(Long id);

    Adresse saveAdresse(Adresse adresse);

    Iterable<Adresse> searchByAdresse(Adresse adresse);
}
