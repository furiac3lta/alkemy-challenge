package org.alkemy.disney.spring.challenge.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="generos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Genero extends Base {

	private static final long serialVersionUID = 1L;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="imagen")
	private String imagen;
	
	@Column(name="peliculas")
	@OneToMany (cascade = CascadeType.ALL)
	private List<Pelicula> peliculas;

}
