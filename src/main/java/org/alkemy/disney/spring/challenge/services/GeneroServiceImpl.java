package org.alkemy.disney.spring.challenge.services;



import org.alkemy.disney.spring.challenge.entities.Genero;
import org.alkemy.disney.spring.challenge.repositories.BaseRepository;
import org.alkemy.disney.spring.challenge.repositories.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroServiceImpl extends BaseServiceImpl<Genero, Long> implements GeneroService{

	@SuppressWarnings("unused")
	@Autowired
	private GeneroRepository generoRepository;
	 
	public GeneroServiceImpl(BaseRepository<Genero, Long> baseRepository) {
		super(baseRepository);
	}

	

}
