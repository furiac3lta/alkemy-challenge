package org.alkemy.disney.spring.challenge.controllers;

import org.alkemy.disney.spring.challenge.entities.Pelicula;
import org.alkemy.disney.spring.challenge.services.PeliculaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/peliculas")
public class PeliculaController  extends BaseControllerImpl<Pelicula, PeliculaServiceImpl>  {
	
	
}
