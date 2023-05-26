<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file= "Logout.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    body{
        background-image: url(https://cdn.firstcry.com/education/2022/03/07110617/700225975-696x476.jpg);
        background-size: cover;
        background-repeat: no-repeat;
   }
   div{
   		margin-left:500px;
   		border: 2px solid rgb(110, 108, 108);
        border-radius: 5px;
        padding: 20px;
        background-color: lightyellow;
        height: 200px;
        width: 280px;
        top: -50px;
        left: -230px;
        overflow: hidden;
   }
   
</style>
</head>
<body>
<div>
	
	<h1 > Admin Login</h1>
	<form action="verifyadminlogin" method="post">
	<table>
	<tr> <td>Email</td> <td><input type="text" name="email"/></td></tr>
	<tr><td>Password</td><td><input type="text" name="password"/></td></tr>
	<tr><td><input type="submit" value="Login"/></td></tr>
	</table>
	</form>
	<%
		if(request.getAttribute("error")!=null){
		out.println(request.getAttribute("error"));
		}
		%>

</div>
</body>
</html>