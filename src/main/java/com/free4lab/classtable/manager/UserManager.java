package com.free4lab.classtable.manager;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import com.free4lab.classtable.model.dao.User;
import com.free4lab.classtable.model.dao.UserDAO;

public class UserManager {
	
	private static final Logger logger = Logger.getLogger(UserManager.class);
	public static List<User> getAllUser(){
		List<User> user = new ArrayList<User>();
		user= new UserDAO().findAll();
		
		logger.info("findding all useres!");
		return user;
	}	
	
	public static List<User> getUser(int user_ID){
		List<User> user = new ArrayList<User>();
		//user= new UserDAO().findUser(user_ID);
		logger.info("根据用户ID，findding 特定的 user!");
		return user;
	}	
}
