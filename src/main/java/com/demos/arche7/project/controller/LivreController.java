package com.demos.arche7.project.controller;

import com.demos.arche7.project.model.Livre;
import com.demos.arche7.project.service.Livre.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
/**
 * @author Fatima
 * @version 1.0
 */

@RestController
@RequestMapping("/livres")
@CrossOrigin
public class LivreController {
    @Autowired
    private LivreService livreService;


    /**construction de la méthode read avec le verb Get pour recupérer les livres*/
    @GetMapping
    public Iterable<Livre> readAll() {return livreService.getAllLivres(); }
    @PostMapping("/save")
    public Livre save (@RequestBody Livre livre) {
        return livreService.saveLivre(livre);
    }
    @GetMapping("/{id}")
    public Optional<Livre> readById(Long id) {return livreService.findById(id);}

    /**construction de la méthode create avec  le verb Post pour ajouter les articles*/
    /** appel à la classe service*/

    @GetMapping(params = "/{titre}")
    public List<Livre> rechercheParTitre(@RequestParam String titre){
        return livreService.findByTitre(titre);
    }

}



