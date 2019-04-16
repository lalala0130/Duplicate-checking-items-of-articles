<%@page import="com.Util.pachongUtil"%>
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
pachongUtil pachong = new pachongUtil();
System.out.println(pachong.word("大数据"));
%>
</body>
</html>