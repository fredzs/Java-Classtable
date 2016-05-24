package com.free4lab.classtable.action;

import java.util.ArrayList;
import java.util.List;

import com.free4lab.classtable.model.dao.ClassTable;
import com.free4lab.classtable.model.dao.ClassTableDAO;
import com.opensymphony.xwork2.ActionSupport;

public class TeacherAction extends ActionSupport{
	
	private static final long serialVersionUID = 1597845248940902378L;

	private int teacher_ID;
	private List<ClassTable> classtable_list = new ArrayList<ClassTable>();
	public String execute()
	{
		System.out.println(teacher_ID);
		setClasstable_list(new ClassTableDAO().findteachertable(teacher_ID));
		return SUCCESS;
	}

	public List<ClassTable> getClasstable_list() {
		return classtable_list;
	}

	public void setClasstable_list(List<ClassTable> classtable_list) {
		this.classtable_list = classtable_list;
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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
