package com.tcs.hibernate.main;

import java.util.List;

import org.apache.log4j.Logger;

import com.tcs.hibernate.dao.StudentDAO;
import com.tcs.hibernate.entity.Student;

public class AppMain {

	public final static Logger logger = Logger.getLogger(AppMain.class);

	public static void create() {
		new StudentDAO().createRecord();
	}

	public static void read() {
		List<Student> viewStudents = new StudentDAO().displayRecords();
		if (viewStudents != null & viewStudents.size() > 0) {
			for (Student studentObj : viewStudents) {
				logger.info(studentObj.toString());
			}
		}
	}

	public static void update() {
		int updateId = 1;
		new StudentDAO().updateRecord(updateId);
	}

	public static void delete() {
		int deleteId = 5;
		new StudentDAO().deleteRecord(deleteId);
		logger.info("\n=======READ RECORDS AFTER DELETION=======\n");
		List<Student> deleteStudentRecord = StudentDAO.displayRecords();
		for (Student studentObj : deleteStudentRecord) {
			logger.info(studentObj.toString());
		}
	}

	public static void main(String[] args) {
		logger.info(".......Hibernate Crud Operations Example.......\n");

//		logger.info("\n=======CREATE RECORDS=======\n");
//		AppMain.create();

//
		logger.info("\n=======UPDATE RECORDS=======\n");
		AppMain.update();

		logger.info("\n=======READ RECORDS AFTER UPDATE=======\n");
		AppMain.read();
//		logger.info("\n=======READ RECORDS AFTER UPDATION=======\n");
//		
//
//		logger.info("\n=======DELETE RECORD=======\n");

//		logger.info("\n=======DELETE ALL RECORDS=======\n");
//		StudentDAO.deleteAllRecords();
//		logger.info("\n=======READ RECORDS AFTER ALL RECORDS DELETION=======");
//		List<Student> deleteAll = StudentDAO.displayRecords();
//		if(deleteAll.size() == 0) {
//			logger.info("\nNo Records Are Present In The Database Table!\n");
//		}		
		System.exit(0);
	}
}