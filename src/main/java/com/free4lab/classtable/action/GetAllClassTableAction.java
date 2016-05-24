package com.free4lab.classtable.action;

import java.util.ArrayList;
import java.util.List;

import com.free4lab.classtable.model.dao.ClassTable;
import com.free4lab.classtable.model.dao.ClassTableDAO;
import com.opensymphony.xwork2.ActionSupport;

public class GetAllClassTableAction extends ActionSupport{
	
	/**
	 * 获取reserve表中全部预订信息
	 */
	private static final long serialVersionUID = 1597845248940902378L;
	private int table_ID;
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
	private List<ClassTable> classtable_list = new ArrayList<ClassTable>();
	public String execute()
	{
		setClasstable_list(new ClassTableDAO().findAll());
		return SUCCESS;
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
	 * @return the classtable_list
	 */
	public List<ClassTable> getClasstable_list() {
		return classtable_list;
	}
	/**
	 * @param classtable_list the classtable_list to set
	 */
	public void setClasstable_list(List<ClassTable> classtable_list) {
		this.classtable_list = classtable_list;
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
