package com.free4lab.classtable.model.dao;
import java.util.List;
import java.util.logging.Level;

import javax.persistence.Query;

import com.free4lab.utils.sql.*;
import com.free4lab.utils.sql.entitymanager.NoCacheEntityManagerHelper;


/**
 * The persistent class for the student database table.
 * 
 */

public class StudentDAO  extends AbstractDAO<Student> {
	
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	@Override
	public Class<Student> getEntityClass() {
		// TODO Auto-generated method stub
		return Student.class;
	}
	
	public String getClassName() {
		return getEntityClass().getName();
	}
	
	@Override
	public IEntityManagerHelper getEntityManagerHelper() {
		// TODO Auto-generated method stub
		return new NoCacheEntityManagerHelper();
	}
	
	public static final String PU_NAME = "CLASSTABLEPU";
	
	@Override
	public String getPUName() {
		// TODO Auto-generated method stub
		return PU_NAME;
	}

	public Student createStudent(String student_name,String identity,String class_ID,String email,String telephone){
		log("finding " + getClassName() + " instance: create a student",
    			Level.INFO, null);
		Student student = new Student();
		student.setClass_ID(class_ID);
		student.setEmail(email);
		student.setIdentity(identity);
		student.setStudent_name(student_name);
		student.setTelephone(telephone);
		save(student);
		return student; 
	}
	public boolean editStudent(int student_ID, String student_name,String identity,String class_ID,String email,String telephone){
		log("finding " + getClassName() + " instance: update a student",
    			Level.INFO, null);
		boolean done = false;
		Student student = new Student();
		student.setStudent_ID(student_ID);
		student.setClass_ID(class_ID);
		student.setEmail(email);
		student.setIdentity(identity);
		student.setStudent_name(student_name);
		student.setTelephone(telephone);
		update(student);
		done = true;
		return done; 
	}
	@SuppressWarnings("unchecked")
	public List<Student> findOld(int student_ID) 
	{
		String queryString = "select model from " + getClassName()
				+ " model where model.student_ID=:student_ID";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("student_ID", student_ID);
		List<Student> i = query.getResultList();
		return i;
	}

}