package com.library.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DaoConnection {
	
	public static Connection con = null;
	
	public static Connection get() {
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/main_proj?user=root&password=root");
			if (con != null) {
				return con;
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
