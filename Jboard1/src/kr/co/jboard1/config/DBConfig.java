package kr.co.jboard1.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {

<<<<<<< HEAD
	// DB정보 - 배포용
	//public static final String HOST = "jdbc:mysql://";
	//public static final String USER = "jhr";
	//public static final String PASS = "qlfanfkela10121";
	
	// DB정보 - 개발용
	public static final String HOST = "jdbc:mysql://192.168.44.46:3306/jhr";
	public static final String USER = "jhr";
	public static final String PASS = "1234";
	
	public static Connection getConnection() throws Exception {
		// 1단계
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2단계
=======
	// DB�젙蹂� - 諛고룷�슜
	//public static final String HOST = "jdbc:mysql://";
	//public static final String USER = "jhr";
	//public static final String PASS = "qlfanfkela10121";
	
	// DB�젙蹂� - 媛쒕컻�슜
	public static final String HOST = "jdbc:mysql://192.168.44.46:3306/jhr";
	public static final String USER = "jhr";
	public static final String PASS = "1234";
	
	public static Connection getConnection() throws Exception {
		// 1�떒怨�
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2�떒怨�
>>>>>>> branch 'master' of https://github.com/wngkfla01/Jsp.git
		Connection conn = DriverManager.getConnection(HOST, USER, PASS);
		
		return conn;
	}	
}