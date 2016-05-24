package com.free4lab.classtable.model.dao;

import java.io.Serializable;

import javax.persistence.*;

/**
 * The persistent class for the class_table database table.
 * 
 */
@Entity
@Table(name="Teacher")
public class Teacher implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int teacher_ID;

	@Column(length=255)
	private String teacher_name;

	@Column(length=255)
	private String identity;
	
	@Column(length=255)
	private String email;
	
	@Column(length=255)
	private String phone;
	
	@Column(length=255)
	private String academy;
	

	public Teacher(String teacher_name, String identity, String email,String phone, String academy) 
	{
		this.teacher_name = teacher_name;
		this.identity = identity;		
		this.email = email;
		this.phone = phone;
		this.academy = academy;
	}
	
	public Teacher(int teacher_ID, String teacher_name, String identity, String email,String phone, String academy) 
	{
		this.teacher_ID = teacher_ID;
		this.teacher_name = teacher_name;
		this.identity = identity;		
		this.email = email;
		this.phone = phone;
		this.academy = academy;	
	}

	public Teacher(){
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

	public String getAcademy() {
		return academy;
	}

	public void setAcademy(String academy) {
		this.academy = academy;
	}



}