<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String type1 =request.getParameter("type");
	System.out.println(type1);
	String num="2";
	int  type = Integer.parseInt(type1);
	System.out.println(type);
	
	
	
	
	%>
</body>
</html>