package com.nit.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertElement {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","MYDB9AM","MYDB9AM");
			Statement stmt=con.createStatement();
//			stmt.execute("create table register(rid number(2),name varchar2(10),city varchar2(10))");
//			System.out.println("table created");
			PreparedStatement ps=con.prepareStatement("insert into register values(11,'ahmed','hyd')");
			int i=ps.executeUpdate();
		
					
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
