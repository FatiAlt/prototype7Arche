package com.demos.arche7.project.controller;

import com.demos.arche7.project.model.Livre;
import com.demos.arche7.project.repository.LivreRepository;
import com.demos.arche7.project.service.Livre.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livre")
@CrossOrigin
public class LivreController {
    @Autowired
    LivreService livreService;
    @Autowired
    private LivreRepository livreRepository;

    //construction de la méthode read avec le verb Get pour recupérer les articles
    @GetMapping
    public Iterable<Livre> readAll() {

        return livreService.getAllLivres();
    }
    @GetMapping("/{id}")
    public Optional<Livre> readById(Long id) {
    // a implementer
        return livreService.findById(id);
    }

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

    //auteur, editeur, genre mettre les méthodes
/*
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

*/
/*
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
*/
/*public class GenreController {
    @Autowired
    private GenreService genreService;

    @GetMapping("/{id}")
    public Iterable<Genre> read() {
        return genreService.getAllGenres();
    }
    @PostMapping("/{id}")
    public Genre save (@RequestBody Genre genre) {
        return genreService.saveGenre(genre);
    }
  *//*  @GetMapping(params = {"/nom"})
    public List<Genre> rechercheParGenre(@RequestParam String nomGenre) {
        return genreService.findByGenre(nomGenre);
    }*/

}
