package org.alkemy.disney.spring.challenge.entities;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "peliculas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pelicula extends Base{

	private static final long serialVersionUID = 1L;

	@Column(name = "imagen")
	private String imagen;

	
	@JsonFormat(pattern="yyyy-MM-dd", shape = Shape.STRING)
	@Column(name = "fecha_de_creacion")
	private String fechaDeCreacion;

	@Column(name = "titulo")
	private String titulo;

	@Column(name = "calificacion")
	private int calificacion;

	@ManyToMany(cascade=CascadeType.REFRESH)
	private List<Personaje> personajes;

	
}
