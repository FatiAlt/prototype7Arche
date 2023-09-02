package com.demos.arche7.project.repository;

import com.demos.arche7.project.model.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ClientRepository extends CrudRepository<Client, Long> {


}
