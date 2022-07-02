package org.alkemy.disney.spring.challenge.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "personajes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Personaje extends Base{

	private static final long serialVersionUID = 1L;

	@Column(name = "imagen")
	private String imagen;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "edad")
	private int edad;

	@Column(name = "peso")
	private int peso;

	@Column(name = "historia")
	private String historia;

	@ManyToMany(cascade = CascadeType.REFRESH)
	private List<Pelicula> peliculas;

	
}
