package com.demos.arche7.project.controller;

import com.demos.arche7.project.exception.ResourceNotFoundException;
import com.demos.arche7.project.model.Client;
import com.demos.arche7.project.repository.ClientRepository;
import com.demos.arche7.project.service.Client.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

/**
 *
 */
@RestController
@RequestMapping("/client")
@CrossOrigin
public class ClientController {
    /**
     *
     */
    @Autowired
    ClientService clientService;

    @Autowired
    private ClientRepository clientRepository;

    //construction de la méthode read avec le verb Get pour recupérer les clients
    @GetMapping
    public Iterable<Client> readAll() {
        return clientService.getAllClients();
    }
    @GetMapping("/{id}")
    public Optional<Client> readById(Long id) {
        return clientService.findById(id);
    }

    //construction de la méthode create avec  le verb Post pour ajouter les articles
    @PostMapping
    public Client save (@RequestBody Client client) {
        return clientService.saveClient(client);
    }

    //construction de la méthode Delete avec le verb Delete pour supprimer les articles
    @DeleteMapping("/{id}")
    public Client client (@PathVariable Long id) {
        return client(id);
    }

    //construction de la méthode Update avec le verb Put pour mettre à jour le fichier client avec la method responseEntity
    @PutMapping("/{id}")
    public ResponseEntity<Client> updateArticle(@PathVariable long id, @RequestBody Client client) {
        Client updateClient = clientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("This customer does not exist with id:" + id));

        updateClient.setNom(client.getNom());
        updateClient.setPrenom(client.getPrenom());
        updateClient.setEmail(client.getEmail());
        updateClient.setPassword(client.getPassword());


        clientRepository.save(updateClient);

        return ResponseEntity.ok(updateClient);
    }
    // recherche en fonction de la référence (avec un paramètre de type ?ref=)
    @GetMapping(params = {"ref"})
    public Client findByRef (@RequestParam String ref){
        return clientService.rechercheRef(ref);
    }

    //recherche en fonction de la désignation(params type)
    @GetMapping(params = {"designation"})
    public List<Client> findByDesignation(@RequestParam String designation){
        return clientService.findByDesignation(designation);
    }


}
