package com.free4lab.classtable.action;

import java.util.List;

import com.free4lab.classtable.model.dao.ClassTable;
import com.free4lab.classtable.model.dao.ClassTableDAO;
import com.opensymphony.xwork2.ActionSupport;

public class GetOldClassTableAction extends ActionSupport{

	/**
	 * 获取ClassTable表中全部预订信息
	 */
	private static final long serialVersionUID = 5130318220527674491L;
	private int table_ID;
	private List<ClassTable> res1;
	private ClassTable res;
	public String execute()
	{
		try 
		{	
			System.out.println("课程表编号："+table_ID);
			setRes1(new ClassTableDAO().findOld(table_ID));
			setRes(res1.get(0));
		}
		catch (Exception e) {
			System.out.println("修改异常");
			return ERROR;
		}
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
	 * @return the res1
	 */
	public List<ClassTable> getRes1() {
		return res1;
	}
	/**
	 * @param res1 the res1 to set
	 */
	public void setRes1(List<ClassTable> res1) {
		this.res1 = res1;
	}
	/**
	 * @return the res
	 */
	public ClassTable getRes() {
		return res;
	}
	/**
	 * @param res the res to set
	 */
	public void setRes(ClassTable res) {
		this.res = res;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
