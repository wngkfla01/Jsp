package kr.co.jboard1.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {

<<<<<<< HEAD
	// DBÁ¤º¸ - ¹èÆ÷¿ë
	//public static final String HOST = "jdbc:mysql://";
	//public static final String USER = "jhr";
	//public static final String PASS = "qlfanfkela10121";
	
	// DBÁ¤º¸ - °³¹ß¿ë
	public static final String HOST = "jdbc:mysql://192.168.44.46:3306/jhr";
	public static final String USER = "jhr";
	public static final String PASS = "1234";
	
	public static Connection getConnection() throws Exception {
		// 1´Ü°è
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2´Ü°è
=======
	// DBì •ë³´ - ë°°í¬ìš©
	//public static final String HOST = "jdbc:mysql://";
	//public static final String USER = "jhr";
	//public static final String PASS = "qlfanfkela10121";
	
	// DBì •ë³´ - ê°œë°œìš©
	public static final String HOST = "jdbc:mysql://192.168.44.46:3306/jhr";
	public static final String USER = "jhr";
	public static final String PASS = "1234";
	
	public static Connection getConnection() throws Exception {
		// 1ë‹¨ê³„
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2ë‹¨ê³„
>>>>>>> branch 'master' of https://github.com/wngkfla01/Jsp.git
		Connection conn = DriverManager.getConnection(HOST, USER, PASS);
		
		return conn;
	}	
}