<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Yahoo !!!</title>
</head>
<body>

<form action="/login.do" method="post">
<p> <font color="red"> ${errorMessage} </font> 
</p>
Enter your name <input type="text" name="name">  Password: <input type="password" name="password">  <input type="submit" value="Login" > 
</form>

</body>
</html>