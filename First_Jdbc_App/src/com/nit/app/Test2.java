package com.nit.app;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args)throws ClassNotFoundException,FileNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file name");
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver is loadded sucessfully");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","advmustafa","mustafa");
		System.out.println("connection is created");
		Statement stmt = con.createStatement();
		System.out.println("Statement is created");
		
		//4. Executing queries
//		stmt.execute("ALTER SESSION SET \"_ORACLE_SCRIPT\" = true");
//		stmt.execute("CREATE USER advmustafa IDENTIFIED BY mustafa");
//		stmt.execute("GRANT connect, resource, unlimited tablespace to advmustafa");
//		System.out.println("User is created and DBA permissions are granted");
//		
//		
//		stmt.execute("create table student(sid number(2),sname varchar2(10))");
//		System.out.println("table created sucess");
		//String sql="insert into student values(?,?)";
		//PreparedStatement ps=con.prepareStatement("DELETE STUDENT WHERE SID=?");
		//PreparedStatement ps=con.prepareStatement("insert into student values(?,?)");
		PreparedStatement ps=con.prepareStatement("insert into student(sid,sname) values(?,?)");
		//PreparedStatement ps=con.prepareStatement("update student set(addres=? varchar2(10))");
//		String sql = "UPDATE student SET sname = ? WHERE sid = ?";
//		PreparedStatement ps = con.prepareStatement(sql);

		// set values
		 // new address
		ps.setInt(1, 1);
		ps.setString(2, "Hyderabad"); 
		
//		ps.setInt(1,13);
//		ps.setString(2, "ravi");
		System.out.println("data updated");
	    int t=ps.executeUpdate();
		}
		catch(Exception e)
		{
		//5. closing connections
		e.printStackTrace();
		}

	}

}
