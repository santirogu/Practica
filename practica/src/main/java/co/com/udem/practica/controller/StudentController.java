package co.com.udem.practica.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import co.com.udem.bussines.StudentService;
import co.com.udem.practica.DTO.StudentDTO;
import co.com.udem.practica.domain.Estudiante;

@Controller
@RequestMapping("/students")
public class StudentController {
	@Autowired
	public StudentService studentService;
	
	@RequestMapping("/student-list")
	public ModelAndView StudentList(@RequestParam(value = "name", required = false, defaultValue = "Santiago") String name){
		//String name = "Santiago";
		List<Estudiante> students = studentService.getStudentsList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("students", students);
		mv.addObject("name", name);
		return mv;
	}
	
	@RequestMapping("/student-listAPI")
	public @ResponseBody List<Estudiante> MoviesListAPI(@RequestParam(value = "name", required = false, defaultValue = "Santiago") String name){
		System.out.println(name);
		List<Estudiante> student = studentService.getStudentsList();
		return student;
	}
	
	//Metodo para insertar un estudiante.
	@RequestMapping("/insertStudent")
	public @ResponseBody String insertStudent(@RequestParam(value="nombre",required=true)String nombre, @RequestParam(value="cc",required=true)String cc, @RequestParam(value="edad",required=true)String edad,@RequestParam(value="nota",required=true)String nota){
		Estudiante e = new Estudiante(nombre, cc, Short.parseShort(edad), Double.parseDouble(nota));	
		System.out.println(studentService.insertStudent(e));
		return studentService.insertStudent(e);
	}
	
	@RequestMapping("/deleteStudent")
	public @ResponseBody String deleteStudent(@RequestParam(value="id",required=true)String id){
		System.out.println(studentService.deleteStudent(Long.parseLong(id)));
		return studentService.deleteStudent(Long.parseLong(id));
	}
	
	@RequestMapping("/updateStudent")
	public @ResponseBody String updateStudent(@RequestParam(value="id",required=true)String id,@RequestParam(value="nombre",required=true)String nombre, @RequestParam(value="cc",required=true)String cc, @RequestParam(value="edad",required=true)String edad,@RequestParam(value="nota",required=true)String nota){
		Estudiante e = new Estudiante(nombre, cc, Short.parseShort(edad), Double.parseDouble(nota));
		String etd = studentService.updateStudent(Long.parseLong(id),e);
		System.out.println(etd);
		return etd;
	}
	
}
