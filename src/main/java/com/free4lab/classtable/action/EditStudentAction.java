package com.free4lab.classtable.action;

import com.free4lab.classtable.model.dao.StudentDAO;

public class EditStudentAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	private int student_ID;
	private String student_name;
	private String identity;
	private String class_ID;
	private String email;
	private String telephone;
	private boolean done;
	public String execute() 
	{
		
		try 
		{	
			done = new StudentDAO().editStudent(student_ID, student_name, identity, class_ID, email, telephone);
			if (!done)
				return ERROR;
		}
		catch (Exception e) {
			System.out.println("修改异常");
			return ERROR;
		}
		return SUCCESS;
		
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


	/**
	 * @return the student_ID
	 */
	public int getStudent_ID() {
		return student_ID;
	}


	/**
	 * @param student_ID the student_ID to set
	 */
	public void setStudent_ID(int student_ID) {
		this.student_ID = student_ID;
	}


	/**
	 * @return the student_name
	 */
	public String getStudent_name() {
		return student_name;
	}


	/**
	 * @param student_name the student_name to set
	 */
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}


	/**
	 * @return the identity
	 */
	public String getIdentity() {
		return identity;
	}


	/**
	 * @param identity the identity to set
	 */
	public void setIdentity(String identity) {
		this.identity = identity;
	}


	/**
	 * @return the class_ID
	 */
	public String getClass_ID() {
		return class_ID;
	}


	/**
	 * @param class_ID the class_ID to set
	 */
	public void setClass_ID(String class_ID) {
		this.class_ID = class_ID;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}


	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
