package com.free4lab.classtable.action;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

import com.free4lab.classtable.manager.TeacherManager;
import com.free4lab.classtable.model.dao.Teacher;
import com.free4lab.classtable.model.dao.TeacherDAO;
import com.opensymphony.xwork2.ActionSupport;

public class GetAllTeacherAction extends ActionSupport{
	
	/**
	 * 获取reserve表中全部预订信息
	 */
	private static final Logger logger = Logger.getLogger(TeacherManager.class);
	private static final long serialVersionUID = 1597845248940902378L;
	private int teacher_ID;
	private String teacher_name;
	private String identity;
	private String email;
	private String phone;
	private String academy;
	private List<Teacher> teacher_list = new ArrayList<Teacher>();
	public String execute()
	{
		try 
		{	
			//new TeacherDAO().createTeacher("李老师","123123123123123123","1234566@haha.com","1333333333","计算机学院");
		}
		catch (Exception e) {
			logger.info("插入失败！！！");
			e.printStackTrace();
		}
		setTeacher_list(new TeacherDAO().findAll());
		return SUCCESS;
	}
	/**
	 * @return the teacher_ID
	 */
	public int getTeacher_ID() {
		return teacher_ID;
	}
	/**
	 * @param teacher_ID the teacher_ID to set
	 */
	public void setTeacher_ID(int teacher_ID) {
		this.teacher_ID = teacher_ID;
	}
	/**
	 * @return the teacher_name
	 */
	public String getTeacher_name() {
		return teacher_name;
	}
	/**
	 * @param teacher_name the teacher_name to set
	 */
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
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
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the teacher_list
	 */
	public List<Teacher> getTeacher_list() {
		return teacher_list;
	}
	/**
	 * @param teacher_list the teacher_list to set
	 */
	public void setTeacher_list(List<Teacher> teacher_list) {
		this.teacher_list = teacher_list;
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
	public String getAcademy() {
		return academy;
	}
	public void setAcademy(String academy) {
		this.academy = academy;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}



}
