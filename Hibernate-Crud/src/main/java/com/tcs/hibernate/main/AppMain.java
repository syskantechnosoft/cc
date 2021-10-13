package com.tcs.hibernate.main;

import java.util.List;

import org.apache.log4j.Logger;

import com.tcs.hibernate.dao.StudentDAO;
import com.tcs.hibernate.entity.Student;

public class AppMain {

	public final static Logger logger = Logger.getLogger(AppMain.class);

	public static void main(String[] args) {
		logger.info(".......Hibernate Crud Operations Example.......\n");

		logger.info("\n=======CREATE RECORDS=======\n");
		StudentDAO.createRecord();

		logger.info("\n=======READ RECORDS=======\n");
		List<Student> viewStudents = StudentDAO.displayRecords();
		if(viewStudents != null & viewStudents.size() > 0) {
			for(Student studentObj : viewStudents) {
				logger.info(studentObj.toString());
			}
		}

		logger.info("\n=======UPDATE RECORDS=======\n");
		int updateId = 1;
		StudentDAO.updateRecord(updateId);
		logger.info("\n=======READ RECORDS AFTER UPDATION=======\n");
		List<Student> updateStudent = StudentDAO.displayRecords();
		if(updateStudent != null & updateStudent.size() > 0) {
			for(Student studentObj : updateStudent) {
				logger.info(studentObj.toString());
			}
		}

		logger.info("\n=======DELETE RECORD=======\n");
		int deleteId = 5;
		StudentDAO.deleteRecord(deleteId);
		logger.info("\n=======READ RECORDS AFTER DELETION=======\n");
		List<Student> deleteStudentRecord = StudentDAO.displayRecords();
		for(Student studentObj : deleteStudentRecord) {
			logger.info(studentObj.toString());
		}

		logger.info("\n=======DELETE ALL RECORDS=======\n");
		StudentDAO.deleteAllRecords();
		logger.info("\n=======READ RECORDS AFTER ALL RECORDS DELETION=======");
		List<Student> deleteAll = StudentDAO.displayRecords();
		if(deleteAll.size() == 0) {
			logger.info("\nNo Records Are Present In The Database Table!\n");
		}		
		System.exit(0);
	} 
}