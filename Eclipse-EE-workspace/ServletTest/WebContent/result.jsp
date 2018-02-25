<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>加法计算器：</p>
	<p>
		运算结果为：
	<%--<%
		Integer sum = (Integer) request.getAttribute("sum");
		out.print(sum);
	%>--%>
	<%
		Integer sum = (Integer)application.getAttribute("sum");
		out.print(sum);
	%>
	</p>
</body>
</html>