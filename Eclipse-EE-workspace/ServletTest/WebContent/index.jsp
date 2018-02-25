<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme() + ":" + "//" + request.getServerName() + ":" + request.getServerPort()
			+ "/" + request.getServletContext().getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=basePath%>/ServletTest" method="post">
		<p>加法计算器</p>
		<p>
			加数1：<input type="text" name="num1">
		</p>
		<p>
			加数2：<input type="text" name="num2">
		</p>
		<input type="submit" value="计算">
	</form>
</body>
</html>