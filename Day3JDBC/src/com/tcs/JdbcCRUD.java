package com.tcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcCRUD {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//	Step 1 : Loading & Registering the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
//	2) Establishing the connection (URL,USERNAME, PASSWORD)
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/syskan", "root", "root");
//	3) Creating and Executing the Query
		String query = "select * from emp;";
		Statement stmt = conn.createStatement();
//	4) Storing & Processing the Result
		ResultSet rs = stmt.executeQuery(query);
		System.out.println("ID \t Name \t Salary");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
		}
//	5) Closing all the resources
		rs.close();
		stmt.close();
		conn.close();
	}

}
