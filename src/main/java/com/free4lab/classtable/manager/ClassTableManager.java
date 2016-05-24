package com.free4lab.classtable.manager;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.free4lab.classtable.model.dao.ClassTable;
import com.free4lab.classtable.model.dao.ClassTableDAO;

public class ClassTableManager {
	
	private static final Logger logger = Logger.getLogger(ClassTableManager.class);
	public static List<ClassTable> getAllUser()
	{
		List<ClassTable> classtable = new ArrayList<ClassTable>();
		classtable= new ClassTableDAO().findAll();
		logger.info("findding all useres!");
		return classtable;
	}	
	
}
