package co.com.udem.practica.bussines.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.udem.bussines.StudentService;
import co.com.udem.practica.DAO.StudentDAO;
import co.com.udem.practica.DTO.StudentDTO;
import co.com.udem.practica.domain.Estudiante;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDAO studentDAO;

	@Transactional
	public List<Estudiante> getStudentsList() {
		List<Estudiante> students = studentDAO.getStudentList();
		//List<StudentDTO> greatStudents = new ArrayList<StudentDTO>();
		//for (StudentDTO studentDTO : students) {
			//Regla de negocio: Estudiantes mayores de edad.
			//if (studentDTO.getEdad()>=(short)18) {
				//greatStudents.add(studentDTO);
			//}			
			//Regla de negocio: Estudiantes llamados "santiago".
			//if (studentDTO.getNombre().equals("santiago")) {
				//greatStudents.add(studentDTO);
			//}
		//}
		return students;
	}

	@Transactional
	public String insertStudent(Estudiante e) {		
		return studentDAO.insertStudent(e);
	}

	@Transactional
	public String deleteStudent(Long id) {
		return studentDAO.deleteStudent(id);
	}
    @Transactional
	public String updateStudent(Long id,Estudiante e) {
		return studentDAO.updateStudent(id,e);
	}

	public Estudiante getStudentById(Long id) {	
		return studentDAO.getStudentById(id);
	}

}
