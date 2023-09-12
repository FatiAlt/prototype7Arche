package com.demos.arche7.project.controller;

import com.demos.arche7.project.model.Livre;
import com.demos.arche7.project.service.Livre.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
/**
 * Cette classe est un héritage de la classe article
 * @version 1.0
 */

@RestController
@RequestMapping("/livres")
@CrossOrigin
public class LivreController {
    @Autowired
    private LivreService livreService;


    /** méthode Get pour recupérer les livres*/
    @GetMapping
    public Iterable<Livre> readAll() {return livreService.getAllLivres(); }
    @GetMapping(params = "/{titre}")
    public List<Livre> findByTitle(@RequestParam String titre){
        return livreService.findByTitre(titre);
    }

    /**  méthode Post pour ajouter les livres*/
    @PostMapping("/save")
    public Livre save (@RequestBody Livre livre) {
        return livreService.saveLivre(livre);
    }
    @GetMapping("/{id}")
    public Optional<Livre> readById(Long id) {return livreService.findById(id);}

    //appel à la classe service



}



