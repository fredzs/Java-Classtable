package com.free4lab.classtable.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.free4lab.utils.sql.AbstractDAO;
import com.free4lab.utils.sql.IEntityManagerHelper;
import com.free4lab.utils.sql.entitymanager.NoCacheEntityManagerHelper;

public class ClassTableDAO extends AbstractDAO<ClassTable>{
	public String getClassName() {
	    return getEntityClass().getName();
	}
	
	@SuppressWarnings("rawtypes")
	public Class getEntityClass() {
		return ClassTable.class;
	}

	public static final String PU_NAME = "CLASSTABLEPU";
	public String getPUName() {
		return PU_NAME;
	}

	public IEntityManagerHelper getEntityManagerHelper() {
		return new NoCacheEntityManagerHelper();
	}
	/*add other methods behind*/
	public boolean createClassTable(String term_ID, String teacher_name, String class_ID,String classroom,
			String course_name, String start_week, String end_week, String start_time, String end_time, String weekday)
	{
    	ClassTable classTable = new ClassTable(term_ID, teacher_name, class_ID, classroom, course_name,
    											start_week, end_week,  start_time, end_time, weekday);
    	save(classTable);
    	return true;
    }
	
	public boolean editClassTable(int table_ID, String term_ID, String teacher_name, String class_ID,String classroom,
			String course_name, String start_week, String end_week, String start_time, String end_time, String weekday)
	{
    	ClassTable classTable = new ClassTable(table_ID, term_ID, teacher_name, class_ID, classroom, course_name,
    											start_week, end_week,  start_time, end_time, weekday);
    	update(classTable);	
    	return true;
    }

	public List<ClassTable> findAll(){
    	return super.findAll();
    }
	@SuppressWarnings("unchecked")
	public List<ClassTable> findOld(int table_ID) 
	{
		String queryString = "select model from " + getClassName()
				+ " model where model.table_ID=:table_ID";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("table_ID", table_ID);
		List<ClassTable> i = query.getResultList();
		return i;
	}
	@SuppressWarnings("unchecked")
	public List<ClassTable> search(String search_type,String search_str) 
	{
		String queryString = "select model from " + getClassName()
				+ " model where model." + search_type + "='" + search_str +"'";
		Query query = getEntityManager().createQuery(queryString);
		List<ClassTable> i = query.getResultList();
		return i;
	}
    public int deleteClassTable(Integer table_ID)
    {
        EntityManager em = getEntityManager();
		if (em.getTransaction().isActive())
		{
			em.getTransaction().rollback();
		}
		em.getTransaction().begin();
		try {
			
			final String queryString = "delete from " + getClassName() + " model where model.table_ID = :table_ID ";
			Query query = em.createQuery(queryString);
			query.setParameter("table_ID",table_ID);
		    int ans = query.executeUpdate();
			em.getTransaction().commit();
			return ans;
		} catch (RuntimeException re) 
		{
			em.getTransaction().rollback();
			throw re;
		}
    }
    @SuppressWarnings("unchecked")
	public List<ClassTable> findclasstable(int student_ID) 
	{
		String queryString = "select model from " + getClassName()
				+ " model where model.class_ID in (select class_ID from Student model2 where model2.student_ID =:student_ID)";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("student_ID", student_ID);
		List<ClassTable> i = query.getResultList();
		return i;
	}
    @SuppressWarnings("unchecked")
    public List<ClassTable> findteachertable(int teacher_ID) 
	{
		String queryString = "select model from " + getClassName()
				+ " model where model.teacher_name in (select teacher_name from Teacher model2 where model2.teacher_ID =:teacher_ID)";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("teacher_ID", teacher_ID);
		List<ClassTable> i = query.getResultList();
		return i;
	}
    
}