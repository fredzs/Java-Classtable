	package com.free4lab.classtable.action;

import com.free4lab.classtable.model.dao.UserDAO;
import com.opensymphony.xwork2.ActionSupport;

public class EditPasswordAction extends ActionSupport{

	private static final long serialVersionUID = 1597845248940902378L;
	private String user_name;
	private String oldpass;
	private String newpass;
	boolean done = false;
	public String execute()
	{
		try 
		{	
			done = new UserDAO().editPassword(user_name,oldpass,newpass);
			System.out.println(done);
			if (!done)
				return ERROR;
		}
		catch (Exception e) {
			System.out.println("更新异常");
			return ERROR;
		}
		return SUCCESS;
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
	 * @return the oldpass
	 */
	public String getOldpass() {
		return oldpass;
	}
	/**
	 * @param oldpass the oldpass to set
	 */
	public void setOldpass(String oldpass) {
		this.oldpass = oldpass;
	}
	/**
	 * @return the newpass
	 */
	public String getNewpass() {
		return newpass;
	}
	/**
	 * @param newpass the newpass to set
	 */
	public void setNewpass(String newpass) {
		this.newpass = newpass;
	}
	/**
	 * @return the done
	 */
	public boolean isDone() {
		return done;
	}
	/**
	 * @param done the done to set
	 */
	public void setDone(boolean done) {
		this.done = done;
	}




}
