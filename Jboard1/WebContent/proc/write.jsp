<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="kr.co.jboard1.bean.MemberBean"%>
<%@page import="kr.co.jboard1.config.SQL"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="kr.co.jboard1.config.DBConfig"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// 파라미터 수신
	request.setCharacterEncoding("utf-8");

	// Multipart-form 데이터 수신
	String path = "C:\\Users\\bigdata\\Desktop\\Workspace\\Jsp\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\Jboard1\\file";
	MultipartRequest mRequest = new MultipartRequest(request, "./file", 1024, "utf-8", new DefaultFileRenamePolicy());
	
	/*
	// 1, 2단계
	Connection conn = DBConfig.getConnection();
	
	// 3단계
	PreparedStatement psmt = conn.prepareStatement(SQL.INSERT_ARTICLE);
	psmt.setString(1, title);
	psmt.setString(2, content);
	psmt.setString(3, uid);
	psmt.setString(4, regip);
	
	// 4단계
	psmt.executeUpdate();
	
	// 5단계
	// 6단계
	psmt.close();
	conn.close();
	*/
	
	// 리다이렉트
	response.sendRedirect("/Jboard1/list.jsp");
%>
