package co.com.udem.bussines;

import java.util.List;

import co.com.udem.practica.DTO.StudentDTO;
import co.com.udem.practica.domain.Estudiante;

public interface StudentService {
	public List<Estudiante> getStudentsList();
	public String insertStudent(Estudiante e);
	public String deleteStudent(Long id);
	public Estudiante getStudentById(Long id);
	public String updateStudent(Long id,Estudiante e);
}
