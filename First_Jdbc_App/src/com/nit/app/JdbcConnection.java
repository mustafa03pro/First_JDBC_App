package com.nit.app;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {
	
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","MYDB9AM","MYDB9AM");
			java.sql.Statement stmt=con.createStatement();
			stmt.execute("create table student3(sid number(5))");
			System.out.println("table created");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
