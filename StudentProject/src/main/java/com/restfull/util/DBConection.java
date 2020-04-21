package com.restfull.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBConection {
	private static final DBConection dbConection = null;
	static String DB_URL;
	static String DB_USER;
	static String DB_PASS;
    static {
    	ResourceBundle rb=ResourceBundle.getBundle("db.properties");
    	DB_URL=rb.getString("db.url");
    	DB_USER=rb.getString("db.username");
    	DB_PASS=rb.getString("db.password");
    }
	private void creatConnection() {
		Connection con=null;
		
		try {
			con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	// factory method to get this class object as singleton
	public static DBConection getConnObj() {
		if(dbConection!=null) {
			return dbConection;
		}
		return new DBConection();
	}
}
