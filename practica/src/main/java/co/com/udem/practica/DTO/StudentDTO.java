package co.com.udem.practica.DTO;

public class StudentDTO {
	private String nombre;
	private String cc;
	private short edad;
	private double nota;
	
	public StudentDTO(String nombre, String cc, short edad, double nota) {
		super();
		this.nombre = nombre;
		this.cc = cc;
		this.edad = edad;
		this.nota = nota;
	}
	
	public StudentDTO() {
			super();
		}
	
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public short getEdad() {
		return edad;
	}

	public void setEdad(short edad) {
		this.edad = edad;
	}	
	
	
}
