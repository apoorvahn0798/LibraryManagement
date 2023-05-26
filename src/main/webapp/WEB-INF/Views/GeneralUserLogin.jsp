<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file= "Logout.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>General User Login</title>
<style>
body{
        background-image: url(https://www.homesbykimblanton.com/uploads/shared/images/library2.jpg);
        background-size: cover;
        background-repeat: no-repeat;
   }
   div{
   		margin-left:500px;
   		border: 2px solid rgb(110, 108, 108);
        border-radius: 5px;
        padding: 20px;
        background-color: lightpink;
        height: 220px;
        width: 320px;
        top: -50px;
        left: -230px;
        overflow: hidden;
   }
   
   </style>
</head>
<body>
<div>
	
	<h1 align=center>User Login</h1>
	
	<form action="verifyuserlogin" method="post">
	<table>
	<tr><td>Email</td><td><input type="text" name="email"/></td></tr>
	<tr><td>Password</td><td><input type="password" name="password"/></td></tr>
	<tr><td><input type="submit" value="login"/></td></tr>
	</table>
	</form>
	<%
		if(request.getAttribute("error")!=null){
		out.println(request.getAttribute("error"));
		}
		%>
		<P align=center>Don't have an account?<P>
		<P align=center><a href="verifyuserlogin">Create an Account</a><p>
</div>		
</body>
</html>