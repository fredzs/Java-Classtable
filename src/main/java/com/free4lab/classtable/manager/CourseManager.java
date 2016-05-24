package com.free4lab.classtable.manager;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.free4lab.classtable.model.dao.Course;
import com.free4lab.classtable.model.dao.CourseDAO;

public class CourseManager {
	
	private static final Logger logger = Logger.getLogger(CourseManager.class);
	public static List<Course> getAllUser()
	{
		List<Course> course = new ArrayList<Course>();
		course= new CourseDAO().findAll();
		
		logger.info("findding all useres!");
		return course;
	}	
	
}
