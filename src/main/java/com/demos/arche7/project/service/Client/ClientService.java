package com.demos.arche7.project.service.Client;

import com.demos.arche7.project.model.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    Client saveClient(Client client);

    Optional<Client> findById(Long id);

    Iterable<Client> getAllClients();

    Client rechercheRef(String ref);

    List<Client> findByDesignation(String designation);
}
