package com.free4lab.classtable.action;

import java.util.List;

import com.free4lab.classtable.model.dao.Teacher;
import com.free4lab.classtable.model.dao.TeacherDAO;
import com.opensymphony.xwork2.ActionSupport;

public class GetOldTeacherAction extends ActionSupport{

	/**
	 * 获取ClassTable表中全部预订信息
	 */
	private static final long serialVersionUID = 5130318220527674491L;
    private int teacher_ID;
	private String teacher_name;
	private String identity;
	private String email;
	private String phone;
	private String academy;
	private List<Teacher> res1;
	private Teacher res;
	public String execute()
	{
		try 
		{	
			setRes1(new TeacherDAO().findOld(teacher_ID));
			setRes(res1.get(0));
		}
		catch (Exception e) {
			System.out.println("修改异常");
			return ERROR;
		}
		return SUCCESS;
	}

	/**
	 * @return the res1
	 */
	public List<Teacher> getRes1() {
		return res1;
	}
	/**
	 * @param res1 the res1 to set
	 */
	public void setRes1(List<Teacher> res1) {
		this.res1 = res1;
	}
	/**
	 * @return the res
	 */
	public Teacher getRes() {
		return res;
	}
	/**
	 * @param res the res to set
	 */
	public void setRes(Teacher res) {
		this.res = res;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
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
	 * @return the academy
	 */
	public String getAcademy() {
		return academy;
	}

	/**
	 * @param academy the academy to set
	 */
	public void setAcademy(String academy) {
		this.academy = academy;
	}


}
