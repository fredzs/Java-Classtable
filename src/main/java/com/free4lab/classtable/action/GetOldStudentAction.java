package com.free4lab.classtable.action;

import java.util.List;

import com.free4lab.classtable.model.dao.Student;
import com.free4lab.classtable.model.dao.StudentDAO;
import com.opensymphony.xwork2.ActionSupport;

public class GetOldStudentAction extends ActionSupport{

	/**
	 * 获取ClassTable表中全部预订信息
	 */
	private static final long serialVersionUID = 5130318220527674491L;
	private int student_ID;
	private String student_name;
	private String identity;
	private String class_ID;
	private String email;
	private String telephone;
	private List<Student> res1;
	private Student res;
	public String execute()
	{
		try 
		{	
			System.out.println("学生编号："+student_ID);
			setRes1(new StudentDAO().findOld(student_ID));
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
	public List<Student> getRes1() {
		return res1;
	}
	/**
	 * @param res1 the res1 to set
	 */
	public void setRes1(List<Student> res1) {
		this.res1 = res1;
	}
	/**
	 * @return the res
	 */
	public Student getRes() {
		return res;
	}
	/**
	 * @param res the res to set
	 */
	public void setRes(Student res) {
		this.res = res;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
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


}
