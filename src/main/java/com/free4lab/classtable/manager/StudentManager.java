package com.free4lab.classtable.manager;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.free4lab.classtable.model.dao.Student;
import com.free4lab.classtable.model.dao.StudentDAO;

public class StudentManager {
	
	private static final Logger logger = Logger.getLogger(StudentManager.class);
	public static List<Student> getAllUser()
	{
		List<Student> student = new ArrayList<Student>();
		student= new StudentDAO().findAll();
		logger.info("findding all useres!");
		return student;
	}	
	
}
