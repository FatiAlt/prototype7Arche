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

    @PostMapping
    public Adresse save (@RequestBody Adresse adresse) {
        return adresseService.saveAdresse(adresse);
    }

    @DeleteMapping("/{id}")
    public Adresse adresse (@PathVariable Long id) {
        return adresse(id);
    }


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
