<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Village name : '${village}'</p>
<form action="/practice1/student1.com/modelAttribute" method="post">
<input type="text" name="FirstName"/>
<input type="text" name="LastName"/>
<input type="submit" name="submit"/>
</form>

</body>
</html>