package org.alkemy.disney.spring.challenge.services;

import org.alkemy.disney.spring.challenge.entities.Pelicula;
import org.alkemy.disney.spring.challenge.repositories.BaseRepository;
import org.alkemy.disney.spring.challenge.repositories.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaServiceImpl extends BaseServiceImpl<Pelicula, Long> implements PeliculaService{

	@SuppressWarnings("unused")
	@Autowired
	private PeliculaRepository peliculaRepository;
	
	public PeliculaServiceImpl(BaseRepository<Pelicula, Long> baseRepository) {
		super(baseRepository);
	}

	
}
