package com.free4lab.classtable.model.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the class_table database table.
 * 
 */
@Entity
@Table(name="ClassTable")
public class ClassTable implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int table_ID;

	@Column(length=255)
	private String term_ID;
	
	@Column(nullable=false)
	private String teacher_name;

	@Column(length=255)
	private String class_ID;
	
	@Column(length=255)
	private String classroom;
	
	@Column(nullable=false)
	private String course_name;
	
	@Column(length=255)
	private String start_week;
	
	@Column(length=255)
	private String end_week;
	
	@Column(length=255)
	private String start_time;
	
	@Column(length=255)
	private String end_time;
	
	@Column(length=255)
	private String weekday;

	public ClassTable(String term_ID, String teacher_name, String class_ID,String classroom,
			String course_name, String start_week, String end_week, String start_time, String end_time, String weekday) 
	{
		this.term_ID = term_ID;
		this.teacher_name = teacher_name;
		this.class_ID = class_ID;
		this.classroom = classroom;
		this.course_name = course_name;
		this.start_week = start_week;
		this.end_week = end_week;
		this.start_time = start_time;
		this.end_time = end_time;
		this.weekday = weekday;
	}
	
	public ClassTable(int table_ID, String term_ID, String teacher_name, String class_ID,String classroom,
			String course_name, String start_week, String end_week, String start_time, String end_time, String weekday) 
	{
		this.table_ID = table_ID;
		this.term_ID = term_ID;
		this.teacher_name = teacher_name;
		this.class_ID = class_ID;
		this.classroom = classroom;
		this.course_name = course_name;
		this.start_week = start_week;
		this.end_week = end_week;
		this.start_time = start_time;
		this.end_time = end_time;
		this.weekday = weekday;
	}

	public ClassTable(){
	}

	/**
	 * @return the table_ID
	 */
	public int getTable_ID() {
		return table_ID;
	}

	/**
	 * @param table_ID the table_ID to set
	 */
	public void setTable_ID(int table_ID) {
		this.table_ID = table_ID;
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
	 * @return the term_ID
	 */
	public String getTerm_ID() {
		return term_ID;
	}

	/**
	 * @param term_ID the term_ID to set
	 */
	public void setTerm_ID(String term_ID) {
		this.term_ID = term_ID;
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
	 * @return the classroom
	 */
	public String getClassroom() {
		return classroom;
	}

	/**
	 * @param classroom the classroom to set
	 */
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	/**
	 * @return the start_week
	 */
	public String getStart_week() {
		return start_week;
	}

	/**
	 * @param start_week the start_week to set
	 */
	public void setStart_week(String start_week) {
		this.start_week = start_week;
	}

	/**
	 * @return the end_week
	 */
	public String getEnd_week() {
		return end_week;
	}

	/**
	 * @param end_week the end_week to set
	 */
	public void setEnd_week(String end_week) {
		this.end_week = end_week;
	}

	/**
	 * @return the start_time
	 */
	public String getStart_time() {
		return start_time;
	}

	/**
	 * @param start_time the start_time to set
	 */
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	/**
	 * @return the end_time
	 */
	public String getEnd_time() {
		return end_time;
	}

	/**
	 * @param end_time the end_time to set
	 */
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getWeekday() {
		return weekday;
	}

	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}

}