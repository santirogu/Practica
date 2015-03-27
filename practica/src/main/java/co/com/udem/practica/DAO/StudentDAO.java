package co.com.udem.practica.DAO;

import java.util.List;

import co.com.udem.practica.DTO.StudentDTO;
import co.com.udem.practica.domain.Estudiante;

public interface StudentDAO {
	public List<Estudiante> getStudentList();
	public String insertStudent(Estudiante e);
	public String deleteStudent(Long id);
	public Estudiante getStudentById(Long id);
	public String updateStudent(Long id, Estudiante e);	
}
