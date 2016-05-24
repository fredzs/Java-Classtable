package com.free4lab.classtable.model.dao;

import java.io.Serializable;

import javax.persistence.*;

/**
 * The persistent class for the class_table database table.
 * 
 */
@Entity
@Table(name="Course")
public class Course implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int course_ID;

	@Column(length=255)
	private String course_name;
	
	@Column(length=255)
	private String academy;
	
	public Course(String course_name, String academy) 
	{
		this.course_name = course_name;
		this.academy = academy;
	}
	
	public Course(int course_ID, String course_name, String academy) 
	{
		this.course_ID = course_ID;
		this.course_name = course_name;
		this.academy = academy;
	}

	public Course(){
	}

	/**
	 * @return the course_ID
	 */
	public int getCourse_ID() {
		return course_ID;
	}

	/**
	 * @param course_ID the course_ID to set
	 */
	public void setCourse_ID(int course_ID) {
		this.course_ID = course_ID;
	}

	/**
	 * @return the course_name
	 */
	public String getCourse_name() {
		return course_name;
	}

	/**
	 * @param course_name the course_name to set
	 */
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
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


}