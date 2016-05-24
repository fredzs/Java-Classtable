package com.free4lab.classtable.action;

import java.util.ArrayList;
import java.util.List;

import com.free4lab.classtable.model.dao.ClassTable;
import com.free4lab.classtable.model.dao.ClassTableDAO;
import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport{
	
	/**
	 * 获取reserve表中全部预订信息
	 */
	private static final long serialVersionUID = 1597845248940902378L;

	private int student_ID;
	private List<ClassTable> classtable_list = new ArrayList<ClassTable>();
	public String execute()
	{
		//System.out.println(student_ID);
		setClasstable_list(new ClassTableDAO().findclasstable(student_ID));
		return SUCCESS;
	}

	public int getStudent_ID() {
		return student_ID;
	}
	public void setStudent_ID(int student_ID) {
		this.student_ID = student_ID;
	}

	public List<ClassTable> getClasstable_list() {
		return classtable_list;
	}

	public void setClasstable_list(List<ClassTable> classtable_list) {
		this.classtable_list = classtable_list;
	}

}
