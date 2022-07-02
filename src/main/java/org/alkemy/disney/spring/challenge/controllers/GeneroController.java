package org.alkemy.disney.spring.challenge.controllers;

import org.alkemy.disney.spring.challenge.entities.Genero;
import org.alkemy.disney.spring.challenge.services.GeneroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/generos")
public class GeneroController extends BaseControllerImpl<Genero, GeneroServiceImpl> {
	
}
