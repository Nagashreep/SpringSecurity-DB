<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form name="login" action="${pageContext.request.contextPath}/j_spring_security_check">
		<input type="text" name="j_username"> <br>
		<input type="text" name="j_password"> <br><br><br>
	
		<input type="submit" name="submit" value="Submit">
		<input type="reset" name="reset" value="Reset">
	
	</form>

</body>
</html>