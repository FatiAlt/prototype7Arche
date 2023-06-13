package com.demos.arche7.project.controller;

import com.demos.arche7.project.model.Editeur;
import com.demos.arche7.project.repository.EditeurRepository;
import com.demos.arche7.project.service.Editeur.EditeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editeurs")
@CrossOrigin
public class EditeurController {
    @Autowired
    private EditeurService editeurService;

    @GetMapping("/{id}")
    public Iterable<Editeur> read() {
        return editeurService.getAllEditeurs();
    }

    @PostMapping("/{id}")
    public Editeur save (@RequestBody Editeur editeur) {
        return editeurService.saveEditeur(editeur);
    }

    @GetMapping(params = {"/nom"})
    public List<Editeur> rechercheParNom(@RequestParam String nomEditeur){
        return editeurService.findByNomEditeur(nomEditeur);
    }
}
