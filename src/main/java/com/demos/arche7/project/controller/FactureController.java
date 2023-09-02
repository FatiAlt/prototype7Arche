package com.demos.arche7.project.controller;

import com.demos.arche7.project.model.Facture;
import com.demos.arche7.project.repository.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/factures")
@CrossOrigin

public class FactureController {
    @Autowired
    private FactureRepository factureRepository;

    public FactureController(FactureRepository factureRepository) {
        this.factureRepository = factureRepository;
    }

   /* @GetMapping()
    public Iterable <Facture> searchAll(){return factureRepository.getAllFactures();}*/
    @PostMapping("/save")
    public Facture addFacture(@RequestBody Facture facture) {return factureRepository.save(facture);}
}
