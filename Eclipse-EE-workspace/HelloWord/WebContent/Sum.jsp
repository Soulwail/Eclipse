<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>求1-100数字的和</title>
</head>
<body>
<%!
	int i;
	int sum = 0;
%>
<% 
	for (i = 1; i <= 100; i++)
		sum+=i;
%>
<span>1-100的和是：</span><% out.print(sum); %>
</body>
</html>