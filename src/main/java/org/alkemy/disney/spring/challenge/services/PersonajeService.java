package org.alkemy.disney.spring.challenge.services;

import org.alkemy.disney.spring.challenge.entities.Personaje;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonajeService extends BaseService<Personaje, Long>{
    List<Personaje> search(String filtro) throws Exception;
}
