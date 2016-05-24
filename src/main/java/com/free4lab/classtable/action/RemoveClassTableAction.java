package com.free4lab.classtable.action;

import com.free4lab.classtable.model.dao.ClassTableDAO;

public class RemoveClassTableAction extends BaseAction {
	private static final long serialVersionUID = 1L;

	private int table_ID;

	public String execute() {
		new ClassTableDAO().deleteClassTable(table_ID);
		
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




}
