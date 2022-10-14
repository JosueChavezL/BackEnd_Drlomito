package com.generation.DrLomito.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Es una entidad
@Table(name="opiniones_vet")//Estableciendo nombre de base de datos
public class Opiniones_vet {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Genera automáticamente
	@Column(name="opiniones_id",unique=true, nullable=false) // Not null
	private Long id;
	private String opiniones_nombre_autor;
	private String opiniones_calificacion;
	private String usuarios_usuario_id;
	
	public Opiniones_vet(Long id, String, opiniones_nombre_autor opiniones_calificacion, usuarios_usuario_id);
		super();
		this.id = id;
		this.opiniones_nombre_autor = opiniones_nombre_autor;
		this.opiniones_calificacion = opiniones_calificacion;
		this.usuarios_usuario_id = usuarios_usuario_id;
	}//constructor

	public Opiniones_vet () {} //constructor
	
	public String getOpiniones_nombre_autor() {
		return opiniones_nombre_autor;
	}

	public static Opiniones_vet addOpiniones_vet(Opiniones_vet Opiniones_vet) {
		// TODO Auto-generated method stub
		return null;
	}

	public Opiniones_vet getOpinion_vet(Opiniones_vet id) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Opiniones_vet updateOpiniones_vet(Long id, String opiniones_nombre_autor,
			String opiniones_calificacion, Long usuarios_usuario_id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return "Opiniones_vet [opiniones_nombre_autor=" + opiniones_calificacion + ", usuarios_usuario_id=" + Opiniones_vet + "]";
	}//toString

	public static Object longValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public Opiniones_vet deleteOpinion_vet(Long id2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	}


