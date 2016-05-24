package com.free4lab.classtable.action;

import com.free4lab.classtable.model.dao.ClassTableDAO;

public class NewClassTableAction extends BaseAction {
	private static final long serialVersionUID = 1L;

	private String term_ID;
	private String teacher_name;
	private String class_ID;
	private String classroom;
	private String course_name;
	private String start_week;
	private String end_week;
	private String start_time;
	private String end_time;
	private String weekday;
	private boolean done;
	public String execute() 
	{
		try 
		{	
			done = new ClassTableDAO().createClassTable(term_ID, teacher_name, class_ID, classroom, 
					course_name, start_week, end_week,start_time,end_time, weekday);
			System.out.println(done);
			if (!done)
				return ERROR;
		}
		catch (Exception e) {
			System.out.println("添加异常");
			return ERROR;
		}
		return SUCCESS;
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
	 * @return the weekday
	 */
	public String getWeekday() {
		return weekday;
	}
	/**
	 * @param weekday the weekday to set
	 */
	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	
	
}
