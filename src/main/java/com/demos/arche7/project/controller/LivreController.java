package com.demos.arche7.project.controller;

import com.demos.arche7.project.model.Editeur;
import com.demos.arche7.project.model.Livre;
import com.demos.arche7.project.repository.EditeurRepository;
import com.demos.arche7.project.repository.LivreRepository;
import com.demos.arche7.project.service.Editeur.EditeurService;
import com.demos.arche7.project.service.Livre.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livres")
//@RequestMapping("/editeurs")

@CrossOrigin
public class LivreController {
    @Autowired
    private LivreService livreService;
    @Autowired
    private EditeurService editeurService;
    @Autowired
    private LivreRepository livreRepository;
    @Autowired
    private EditeurRepository editeurRepository;


    //construction de la méthode read avec le verb Get pour recupérer les articles
    @GetMapping
    public Iterable<Livre> readAll() {return livreService.getAllLivres(); }
    @GetMapping("/{id}")
    public Optional<Livre> readById(Long id) {return livreService.findById(id);}
    @GetMapping("/editeur")
    public Iterable<Editeur> read() {return editeurService.getAllEditeurs();}

    //construction de la méthode create avec  le verb Post pour ajouter les articles
    //je fais appel à la classe service
    @PostMapping
    public Livre save (@RequestBody Livre livre) {
        return livreService.saveLivre(livre);
    }

    @GetMapping(params = "/{titre}")
    public List<Livre> rechercheParTitre(@RequestParam String titre){
        return livreService.findByTitre(titre);
    }
    @GetMapping("/{id}/{editeur}")
   public Iterable<Editeur> searchById() {return editeurService.getAllEditeurs();}

//    @PostMapping()
//    public Editeur saveByEditeur (@RequestBody Editeur editeur) {
//        return editeurService.saveEditeur(editeur);
//    }


    @PostMapping("/editeur")
    public Editeur save (@RequestBody Editeur editeur) {
        return editeurService.saveEditeur(editeur);
    }

    @GetMapping(params = {"/nom"})
    public List<Editeur> rechercheParNom(@RequestParam String nomEditeur){
        return editeurService.findByNomEditeur(nomEditeur);
    }
}



