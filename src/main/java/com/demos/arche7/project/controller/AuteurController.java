package com.demos.arche7.project.controller;


import com.demos.arche7.project.model.Auteur;
import com.demos.arche7.project.repository.AuteurRepository;
import com.demos.arche7.project.service.Auteur.AuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/auteurs")
@CrossOrigin
public class AuteurController {
    @Autowired
    private AuteurService auteurService;

    @GetMapping("/{id}")
    public Iterable<Auteur> read() {
        return auteurService.getAllAuteurs();
    }

    @PostMapping("/{id}")
    public Auteur save (@RequestBody Auteur auteur) {
        return auteurService.saveAuteur(auteur);
    }

    @GetMapping(params = {"/nom"})
    public List<Auteur> rechercheParNom(@RequestParam String nom){
        return auteurService.findByNom(nom);
    }

    @GetMapping(params = {"/prenom"})
    public List<Auteur> rechercheParPrenom(@RequestParam String prenom){
        return auteurService.findByPrenom(prenom);
    }


}
