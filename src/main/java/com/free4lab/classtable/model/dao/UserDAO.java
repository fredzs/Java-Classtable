package com.free4lab.classtable.model.dao;

import java.util.List;
import java.util.logging.Level;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.free4lab.utils.sql.AbstractDAO;
import com.free4lab.utils.sql.IEntityManagerHelper;
import com.free4lab.utils.sql.entitymanager.NoCacheEntityManagerHelper;

public class UserDAO extends AbstractDAO<User>{
	public String getClassName() {
	    return getEntityClass().getName();
	}
	
	@SuppressWarnings("rawtypes")
	public Class getEntityClass() {
		return User.class;
	}

	public static final String PU_NAME = "CLASSTABLEPU";
	public String getPUName() {
		return PU_NAME;
	}

	public IEntityManagerHelper getEntityManagerHelper() {
		return new NoCacheEntityManagerHelper();
	}
	/*add other methods behind*/
	public User createUser(String user_name, String password, String user_type,int user_sign)
	{
    	User user = new User(user_name, password, user_type, user_sign);
    	save(user);
    	return user;
    }

	public boolean editPassword(String user_name, String oldpass, String newpass)
	{
		boolean done = false;
		List<User> i = findUser(user_name,oldpass);
		if (!i.isEmpty())
		{
			EntityManager em = getEntityManager();
			try {
				if (em.getTransaction().isActive()) {
					em.getTransaction().rollback();
				}
				em.getTransaction().begin();
				final String qlString = "UPDATE User model SET model.password =:newpass WHERE model.user_name =:user_name";
				System.out.println(qlString);
				Query query = em.createQuery(qlString);
				query.setParameter("newpass", newpass);
				query.setParameter("user_name", user_name);
				query.executeUpdate();
				em.getTransaction().commit();
			} catch (Exception e) {
				em.getTransaction().rollback();
				log(e.getMessage(), Level.INFO, e);
			}
			System.out.println("更新完毕");
			done = true;
		}
		else
			System.out.println("没有找到");
		
		
		return done;
	}
    
	@SuppressWarnings("unchecked")
	public List<User> findUser(String user_name, String password) 
	{
		String queryString = "select model from " + getClassName()+ " model"
				+" where model.user_name=:user_name and model.password=:password";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("user_name", user_name);
		query.setParameter("password", password);
		List<User> i = query.getResultList();
		return i;
	}
	
	public List<User> findAll(){
    	return super.findAll();
    }
}