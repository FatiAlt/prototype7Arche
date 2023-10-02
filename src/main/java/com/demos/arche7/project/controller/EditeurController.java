package com.demos.arche7.project.controller;

import com.demos.arche7.project.model.Editeur;
import com.demos.arche7.project.repository.EditeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/editeurs")
@CrossOrigin(origins = "http://localhost:8080")
public class EditeurController {
    @Autowired
    private final EditeurRepository editeurRepository;


    public EditeurController(EditeurRepository editeurRepository) {
        this.editeurRepository = editeurRepository;
    }
    /*    @GetMapping("/editeur")
    public Iterable<Editeur> read() {return editeurService.getAllEditeurs();}*/


    @PostMapping("/save")
    public Editeur addEditeur(@RequestBody Editeur editeur) {
        return editeurRepository.save(editeur);
    }
}






