package kr.co.jboard1.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {

	// DB���� - ������
	//public static final String HOST = "jdbc:mysql://";
	//public static final String USER = "jhr";
	//public static final String PASS = "qlfanfkela10121";
	
	// DB���� - ���߿�
	public static final String HOST = "jdbc:mysql://192.168.44.46:3306/jhr";
	public static final String USER = "jhr";
	public static final String PASS = "1234";
	
	public static Connection getConnection() throws Exception {
		// 1�ܰ�
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2�ܰ�
		Connection conn = DriverManager.getConnection(HOST, USER, PASS);
		
		return conn;
	}	
}