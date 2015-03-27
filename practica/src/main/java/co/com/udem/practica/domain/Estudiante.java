package co.com.udem.practica.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estudiante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEstudiante;
	private String nombre;
	private String cc;
	private short edad;
	private double nota;
	
	
	/** 
	 * @param nombre
	 * @param cc
	 * @param edad
	 * @param nota
	 */
	public Estudiante(String nombre, String cc, short edad,
			double nota) {
		super();		
		this.nombre = nombre;
		this.cc = cc;
		this.edad = edad;
		this.nota = nota;
	}
	
	
	/**
	 * 
	 */
	public Estudiante() {
		super();
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the cc
	 */
	public String getCc() {
		return cc;
	}
	/**
	 * @param cc the cc to set
	 */
	public void setCc(String cc) {
		this.cc = cc;
	}
	/**
	 * @return the edad
	 */
	public short getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(short edad) {
		this.edad = edad;
	}
	/**
	 * @return the nota
	 */
	public double getNota() {
		return nota;
	}
	/**
	 * @param nota the nota to set
	 */
	public void setNota(double nota) {
		this.nota = nota;
	}
}
