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

@RestController
@RequestMapping("/clients")
@CrossOrigin
public class ClientController {
    @Autowired
    ClientService clientService;

    @Autowired
    private ClientRepository clientRepository;

    /**utilisation read avec le verb Get pour recupérer les clients*/
//    @GetMapping
//    public Iterable<Client> readAll() {
//        return clientService.getAllClients();
//    }
//
    /**utilisation du verb Post pour ajouter les articles*/
    @PostMapping
    public Client save (@RequestBody Client client) {
        return clientService.saveClient(client);
    }

    /**verb Delete supprime les articles par leur id*/
//    @DeleteMapping("/{id}")
//    public Client client (@PathVariable Long id) {
//        return client(id);
//    }

    /** méthode Update pour mettre à jour le fichier client*/
/*    @PutMapping("/{id}")
    public ResponseEntity<Client> updateArticle(@PathVariable long id, @RequestBody Client client) {
        Client updateClient = clientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("This customer does not exist with id:" + id));

        updateClient.setNom(client.getNom());
        updateClient.setPrenom(client.getPrenom());
        updateClient.setEmail(client.getEmail());
        updateClient.setPassword(client.getPassword());


        clientRepository.save(updateClient);

        return ResponseEntity.ok(updateClient);
    }*/



}
