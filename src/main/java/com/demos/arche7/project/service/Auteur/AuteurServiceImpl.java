package com.demos.arche7.project.service.Auteur;

import com.demos.arche7.project.model.Auteur;
import com.demos.arche7.project.repository.AuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuteurServiceImpl implements AuteurService {
    @Autowired
    private AuteurRepository auteurRepository;

    @Override
    public Iterable<Auteur> getAllAuteurs() {
        return auteurRepository.findAll();    }

    @Override
    public Auteur saveAuteur(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    @Override
    public List<Auteur> findByNom(String nom) {
        return auteurRepository.findByNom(nom);
    }

    @Override
    public List<Auteur> findByPrenom(String prenom) {
        return auteurRepository.findByPrenom(prenom);
    }

    @Override
    public Optional<Auteur> getFindById(long id) {
        return Optional.empty();
    }


}
