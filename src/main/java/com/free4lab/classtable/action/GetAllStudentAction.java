package com.free4lab.classtable.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.free4lab.classtable.manager.StudentManager;
import com.free4lab.classtable.model.dao.Student;
import com.free4lab.classtable.model.dao.StudentDAO;
import com.opensymphony.xwork2.ActionSupport;

public class GetAllStudentAction extends ActionSupport{
	
	/**
	 * 获取reserve表中全部预订信息
	 */
	private static final Logger logger = Logger.getLogger(StudentManager.class);
	private static final long serialVersionUID = 1597845248940902378L;
	private String student_name;
	private String identity;
	private int class_ID;
	private String email;
	private String telephone;
	private List<Student> student_list = new ArrayList<Student>();
	public String execute()
	{
		try 
		{	
			logger.info("准备插入");
			//new StudentDAO().createStudent("3","2","1","1","1");
		}
		catch (Exception e) {
			logger.info("插入失败！！！");
			e.printStackTrace();
		}
		setStudent_list(new StudentDAO().findAll());
		return SUCCESS;
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
	 * @return the class_ID
	 */
	public int getClass_ID() {
		return class_ID;
	}
	/**
	 * @param class_ID the class_ID to set
	 */
	public void setClass_ID(int class_ID) {
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
	 * @return the student_list
	 */
	public List<Student> getStudent_list() {
		return student_list;
	}
	/**
	 * @param student_list the student_list to set
	 */
	public void setStudent_list(List<Student> student_list) {
		this.student_list = student_list;
	}
	/**
	 * @return the logger
	 */
	public static Logger getLogger() {
		return logger;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	

}
