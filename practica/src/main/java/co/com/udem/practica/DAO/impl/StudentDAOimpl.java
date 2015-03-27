package co.com.udem.practica.DAO.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.EscapeTokenizer;

import co.com.udem.practica.DAO.StudentDAO;
import co.com.udem.practica.domain.Estudiante;

@Repository
public class StudentDAOimpl implements StudentDAO {
	
	@Autowired
	private SessionFactory sessionfactory;

	public List<Estudiante> getStudentList() {
		
		Session session = sessionfactory.getCurrentSession();
		Query query = session.createQuery("FROM Estudiante");		
		
		@SuppressWarnings("unchecked")
		List<Estudiante> listEstudiantes = (List<Estudiante>)query.list();
		return listEstudiantes;
	}

	public String insertStudent(Estudiante e) {
		Session session = sessionfactory.getCurrentSession();	
		String estado = "Error";
		try {				
			session.clear();
			session.saveOrUpdate(e);
			session.flush();
			estado = "Exito!";
		} catch (Exception e2) {
			e2.getMessage();
		}		
		return estado;
	}

	public String deleteStudent(Long id) {
		Session session = sessionfactory.getCurrentSession();	
		String estado = "Error";
		try {	
			Estudiante estudiante = (Estudiante)session.load(Estudiante.class, id);
			session.clear();
			session.delete(estudiante);					
			estado = "Exito!";
		} catch (Exception e2) {
			e2.getMessage();			
		}
		return estado;
	}

	public String updateStudent(Long id,Estudiante e) {
		String estado = "Error";
		Session session = this.sessionfactory.getCurrentSession();
		session.clear();
        Query query = session.createQuery("UPDATE estudiante SET nombre=:updateNombre"+" WHERE idEstudiante=:updateId");
        query.setParameter("updateNombre", e.getNombre());
        query.setParameter("updateCc", e.getCc());
        query.setParameter("updateEdad", e.getEdad());
        query.setParameter("updateNota", e.getNota());
        query.setParameter("updateId", id);
        int i = query.executeUpdate();        
        if (i>0) {
			estado = "Exito!";
		}		
        return estado;
	}

	public Estudiante getStudentById(Long id) {
		Session session = this.sessionfactory.getCurrentSession();
		Estudiante estudiante = (Estudiante)session.load(Estudiante.class, id);
		return estudiante;
	}
	
	
	
	
	
	
	

}
