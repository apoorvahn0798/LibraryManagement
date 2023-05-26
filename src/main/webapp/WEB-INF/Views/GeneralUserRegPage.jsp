<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file= "Logout.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>General User</title>
</head>
<style>
	body{
        background-image: url(https://t3.ftcdn.net/jpg/03/16/86/98/360_F_316869849_oHD2qOXRJlZE2Md6SNv0MtvDcgZyHkfv.jpg);
        background-size: cover;
        background-repeat: no-repeat;
   }
   div{
   		margin-left:500px;
   		border: 2px solid rgb(110, 108, 108);
        border-radius: 5px;
        padding: 20px;
        background-color: lightblue;
        height: 220px;
        width: 320px;
        top: -50px;
        left: -230px;
        overflow: hidden;
   }
   </style>
<body>
	<div align=center>
	<h2> User Registration</h2>
		<form action="savereg" method="post">
		<table>
		<tr><td>First Name</td><td><input type="text" name="firstname"/></td></tr>
		<tr><td>Last Name</td><td><input type="text" name="lastname"/></td></tr>
		<tr><td>Email</td><td> <input type="text" name="email"/></td></tr>
		<tr><td>Password</td><td><input type="password" name="password"/></td></tr>
		<tr><td>Phone No. </td><td><input type="text" name="phone"/></td></tr>
		<tr><td><input type="submit" value="Save"/></td></tr>
		</table>
		</form>
	</div>	
		<%
		if(request.getAttribute("msg")!=null){
		out.println(request.getAttribute("msg"));
		}
		%>
	
</body>
</html>