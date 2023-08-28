package com.demos.arche7.project.service.Adresse;

import com.demos.arche7.project.model.Adresse;
import com.demos.arche7.project.repository.AdresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdresseServiceImpl implements AdresseService {
    @Autowired
    private AdresseRepository adresseRepository;


    @Override
    public Iterable<Adresse> getAllAdresse() {
        return adresseRepository.findAll();
    }

    @Override
    public Optional<Adresse> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Adresse saveAdresse(Adresse adresse) {
        return adresseRepository.save(adresse);

    }
    @Override
    public Iterable<Adresse> searchByAdresse(Adresse adresse) {
        return adresseRepository.findAll();
    }



}
