package com.demos.arche7.project.controller;

import com.demos.arche7.project.model.Auteur;
import com.demos.arche7.project.repository.AuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auteurs")
@CrossOrigin
public class AuteurController {
    @Autowired
    private final AuteurRepository auteurRepository;


    public AuteurController(AuteurRepository auteurRepository) {
        this.auteurRepository = auteurRepository;
    }
    /*@GetMapping()
    public Iterable<Auteur> readAllAuteur() {
        return auteurRepository.getAllAuteurs();
    }*/

    @PostMapping("/save")
    public Auteur addAuteur(@RequestBody Auteur auteur) {
        return auteurRepository.save(auteur);
    }


}
