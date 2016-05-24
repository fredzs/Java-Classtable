package com.free4lab.classtable.manager;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import com.free4lab.classtable.model.dao.Teacher;
import com.free4lab.classtable.model.dao.TeacherDAO;

public class TeacherManager {
	
	private static final Logger logger = Logger.getLogger(TeacherManager.class);
	public static List<Teacher> getAllUser()
	{
		List<Teacher> teacher = new ArrayList<Teacher>();
		teacher= new TeacherDAO().findAll();
		
		logger.info("findding all useres!");
		return teacher;
	}	
	
}
