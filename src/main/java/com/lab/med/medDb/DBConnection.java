package com.lab.med.medDb;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	private static Connection conn;
	public static Connection getConn()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lab","root","mhsb3");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

//	public static Connection getConnection() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
