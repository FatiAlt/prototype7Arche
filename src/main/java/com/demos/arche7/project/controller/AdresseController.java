package com.demos.arche7.project.controller;

import com.demos.arche7.project.model.Adresse;
import com.demos.arche7.project.service.Adresse.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/adresses")

public class AdresseController {

   @Autowired
   AdresseService adresseService;

/**construction de la méthode read avec le verb Get pour recupérer les adresses*/
//    @GetMapping
//    public Iterable<Adresse> readAll() {
//        return adresseService.getAllAdresse();
//    }

    @GetMapping("/{id}")
    public Optional<Adresse> readById(Long id) {
        return adresseService.findById(id);
    }

    @GetMapping("/search")
    public Iterable<Adresse> searchByAdresse()
    {return adresseService.getAllAdresse();}

    /**construction de la méthode create avec  le verb Post pour ajouter les articles*/
    @PostMapping
    public Adresse save (@RequestBody Adresse adresse) {
        return adresseService.saveAdresse(adresse);
    }

    /**construction de la méthode Delete avec le verb Delete pour supprimer l'adresse*/
    @DeleteMapping("/{id}")
    public Adresse adresse (@PathVariable Long id) {
        return adresse(id);
    }

    /**
     * construction de la méthode Update avec le verb Put pour mettre à jour l'adresse avec la method responseEntity
     */
/*    @PutMapping("/{id}")
    public ResponseEntity<Adresse> updateAdresse(@PathVariable long id, @RequestBody Adresse adresse) {
        Adresse updateAdresse = adresseRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Adresse not exist with id:" + id));

        adresse.setNumero(adresse.getNumero());
        adresse.setNomRue(adresse.getNomRue());
        adresse.setCodePostal(adresse.getCodePostal());
        adresse.setVille(adresse.getVille());

        adresseRepository.save(adresse);

        return ResponseEntity.ok(adresse);
    }*/
}
