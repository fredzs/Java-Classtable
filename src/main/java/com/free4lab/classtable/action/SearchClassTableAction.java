package com.free4lab.classtable.action;

import java.util.ArrayList;
import java.util.List;

import com.free4lab.classtable.model.dao.ClassTable;
import com.free4lab.classtable.model.dao.ClassTableDAO;
import com.opensymphony.xwork2.ActionSupport;

public class SearchClassTableAction extends ActionSupport{
	

	private static final long serialVersionUID = 1597845248940902378L;

	private String search_type;
	private String search_str;
	private List<ClassTable> classtable_list = new ArrayList<ClassTable>();
	public String execute()
	{
		setClasstable_list(new ClassTableDAO().search(search_type,search_str));
		return SUCCESS;
	}
	/**
	 * @return the search_type
	 */
	public String getSearch_type() {
		return search_type;
	}
	/**
	 * @param search_type the search_type to set
	 */
	public void setSearch_type(String search_type) {
		this.search_type = search_type;
	}
	/**
	 * @return the search_str
	 */
	public String getSearch_str() {
		return search_str;
	}
	/**
	 * @param search_str the search_str to set
	 */
	public void setSearch_str(String search_str) {
		this.search_str = search_str;
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

}
