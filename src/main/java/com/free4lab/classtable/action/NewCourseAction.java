package com.free4lab.classtable.action;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

import com.free4lab.classtable.manager.CourseManager;
import com.free4lab.classtable.model.dao.Course;
import com.free4lab.classtable.model.dao.CourseDAO;
import com.opensymphony.xwork2.ActionSupport;

public class NewCourseAction extends ActionSupport{
	
	/**
	 * 获取reserve表中全部预订信息
	 */
	private static final Logger logger = Logger.getLogger(CourseManager.class);
	private static final long serialVersionUID = 1597845248940902378L;
	private int course_ID;
	private String course_name;
	private String academy;
	private List<Course> course_list = new ArrayList<Course>();
	public String execute()
	{
		System.out.println(course_name);
		try 
		{	
			new CourseDAO().createCourse(course_name,academy);
		}
		catch (Exception e) {
			logger.info("插入失败！！！");
			e.printStackTrace();
		}
		setCourse_list(new CourseDAO().findAll());
		return SUCCESS;
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
	 * @return the course_list
	 */
	public List<Course> getCourse_list() {
		return course_list;
	}
	/**
	 * @param course_list the course_list to set
	 */
	public void setCourse_list(List<Course> course_list) {
		this.course_list = course_list;
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
