package com.demos.arche7.project.service.Client;

import com.demos.arche7.project.model.Client;
import com.demos.arche7.project.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Client saveClient(Client client) {

        return clientRepository.save(client);
    }


}
