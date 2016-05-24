package com.free4lab.classtable.model.dao;

import java.util.List;

import com.free4lab.utils.sql.AbstractDAO;
import com.free4lab.utils.sql.IEntityManagerHelper;
import com.free4lab.utils.sql.entitymanager.NoCacheEntityManagerHelper;

public class CourseDAO extends AbstractDAO<Course>{
	public String getClassName() {
	    return getEntityClass().getName();
	}
	
	@SuppressWarnings("rawtypes")
	public Class getEntityClass() {
		return Course.class;
	}

	public static final String PU_NAME = "CLASSTABLEPU";
	public String getPUName() {
		return PU_NAME;
	}

	public IEntityManagerHelper getEntityManagerHelper() {
		return new NoCacheEntityManagerHelper();
	}
	/*add other methods behind*/
	public Course createCourse(String course_name, String academy)
	{
    	Course course = new Course(course_name, academy);
    	save(course);
    	return course;
    }

	public List<Course> findAll(){
    	return super.findAll();
    }
}