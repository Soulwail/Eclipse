<%@ page language="java" contentType="text/html; utf-8"
    pageEncoding="utf-8"%>
<%@ page import = "java.util.List,java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	List list = new ArrayList();
	list.add("JSP基础入门");
	list.add("Servlet视频详解");
	list.add("EL表达式初识");
	list.add("JSTL标签库初识");
	for (int i = 0; i < list.size(); i++){
%>
		<span>第</span><%= i+1 %><span>条：</span><%= list.get(i) %>
		<br>
<%}%>
</body>
</html>