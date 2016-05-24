package com.free4lab.classtable.model.dao;

import java.util.List;
import java.util.logging.Level;

import javax.persistence.Query;

import com.free4lab.utils.sql.AbstractDAO;
import com.free4lab.utils.sql.IEntityManagerHelper;
import com.free4lab.utils.sql.entitymanager.NoCacheEntityManagerHelper;

public class TeacherDAO extends AbstractDAO<Teacher>{
	public String getClassName() {
	    return getEntityClass().getName();
	}
	
	@SuppressWarnings("rawtypes")
	public Class getEntityClass() {
		return Teacher.class;
	}

	public static final String PU_NAME = "CLASSTABLEPU";
	public String getPUName() {
		return PU_NAME;
	}

	public IEntityManagerHelper getEntityManagerHelper() {
		return new NoCacheEntityManagerHelper();
	}
	/*add other methods behind*/
	public Teacher createTeacher(String teacher_name, String identity, String email,String phone, String academy)
	{
    	Teacher teacher = new Teacher(teacher_name, identity, academy, email, phone);
    	save(teacher);
    	return teacher;
    }

	public List<Teacher> findAll(){
    	return super.findAll();
    }
	public boolean editTeacher(int teacher_ID, String teacher_name, String identity, String email,String phone, String academy){
		log("finding " + getClassName() + " instance: update a teacher",
    			Level.INFO, null);
		boolean done = false;
		Teacher teacher = new Teacher(teacher_ID,teacher_name, identity, email, phone, academy);
		System.out.println("电话："+phone);
		update(teacher);
		done = true;
		return done; 
	}
	@SuppressWarnings("unchecked")
	public List<Teacher> findOld(int teacher_ID) 
	{
		String queryString = "select model from " + getClassName()
				+ " model where model.teacher_ID=:teacher_ID";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("teacher_ID", teacher_ID);
		List<Teacher> i = query.getResultList();
		return i;
	}
}