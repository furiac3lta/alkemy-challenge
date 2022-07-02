package org.alkemy.disney.spring.challenge.services;

import org.alkemy.disney.spring.challenge.entities.Personaje;
import org.alkemy.disney.spring.challenge.repositories.BaseRepository;
import org.alkemy.disney.spring.challenge.repositories.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeServiceImpl extends BaseServiceImpl<Personaje, Long> implements PersonajeService{


	@SuppressWarnings("unused")
	@Autowired
	private PersonajeRepository personajeRepository;
	
	public PersonajeServiceImpl (BaseRepository<Personaje, Long> baseRepository) {
		super(baseRepository);
	}

	@Override
	public List<Personaje> search(String filtro) throws Exception {
		try{
			List<Personaje> personajes = personajeRepository.searchJpql(filtro);
			return personajes;
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}
}
