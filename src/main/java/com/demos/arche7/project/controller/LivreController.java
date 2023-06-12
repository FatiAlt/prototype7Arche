package com.demos.arche7.project.controller;

import com.demos.arche7.project.model.Livre;
import com.demos.arche7.project.repository.LivreRepository;
import com.demos.arche7.project.service.Livre.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livres")
@CrossOrigin
public class LivreController {
    @Autowired
    private LivreService livreService;
    @Autowired
    private LivreRepository livreRepository;

    //construction de la méthode read avec le verb Get pour recupérer les articles
    @GetMapping("/{id}")
    public Iterable<Livre> read() {
        return livreService.getAllLivres();
    }

    //construction de la méthode create avec  le verb Post pour ajouter les articles
    //je fais appel à la classe service
    @PostMapping("/{id}")
    public Livre save (@RequestBody Livre livre) {
        return livreService.saveLivre(livre);
    }







}
