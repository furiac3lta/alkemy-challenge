package org.alkemy.disney.spring.challenge.repositories;

import org.alkemy.disney.spring.challenge.entities.Personaje;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonajeRepository extends BaseRepository<Personaje, Long> {
    @Query(value="SELECT p FROM Personaje p WHERE p.nombre LIKE %:filtro%")
    List<Personaje> searchJpql(@Param("filtro") String filtro);

    @Query(
            value= "select * from personajes where personajes.nombre like %:filtro%",
            nativeQuery = true
    )
    List<Personaje> searchSql(@Param("filtro") String filtro);

}
