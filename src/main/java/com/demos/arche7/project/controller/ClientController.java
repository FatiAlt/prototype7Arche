package com.demos.arche7.project.controller;

import jakarta.persistence.Table;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Table(name = "client")
@CrossOrigin
public class ClientController {

}
