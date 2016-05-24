package com.free4lab.classtable.action;

import java.util.ArrayList;
import java.util.List;
import com.free4lab.classtable.model.dao.User;
import com.free4lab.classtable.model.dao.UserDAO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginCheckAction extends ActionSupport{

	private static final long serialVersionUID = 1597845248940902378L;
	private int user_ID;
	private String user_name;
	private String password;
	private String user_type;
	private int user_sign;
	private boolean found = false;
	private List<User> user_list = new ArrayList<User>();
	public String execute()
	{
		user_list = new UserDAO().findUser(user_name,password);
		System.out.println(user_list.size());
		if ( !user_list.isEmpty() ) 
		{
			found = true;
			setUser_type(user_list.get(0).getUser_type());
			setUser_sign(user_list.get(0).getUser_sign());
			setUser_ID(user_list.get(0).getUser_ID());
		}
		return SUCCESS;
	}
	/**
	 * @return the user_list
	 */
	public List<User> getUser_list() {
		return user_list;
	}

	/**
	 * @param user_list the user_list to set
	 */
	public void setUser_list(List<User> user_list) {
		this.user_list = user_list;
	}

	/**
	 * @return the user_ID
	 */
	public int getUser_ID() {
		return user_ID;
	}

	/**
	 * @param user_ID the user_ID to set
	 */
	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}

	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}

	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the user_type
	 */
	public String getUser_type() {
		return user_type;
	}

	/**
	 * @param user_type the user_type to set
	 */
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	/**
	 * @return the user_sign
	 */
	public int getUser_sign() {
		return user_sign;
	}
	/**
	 * @param user_sign the user_sign to set
	 */
	public void setUser_sign(int user_sign) {
		this.user_sign = user_sign;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public boolean getFound() {
		return found;
	}

	public void setFound(boolean found) {
		this.found = found;
	}


}
