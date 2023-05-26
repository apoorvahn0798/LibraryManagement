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
		background-image: url(https://media.gettyimages.com/id/1193273154/photo/empty-wooden-tables-in-public-library.jpg?s=612x612&w=gi&k=20&c=wf6WhZ9VzOxPttYgLc6A8MlzelL-1pTk5JaFm-SQymE=);
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
        width: 300px;
        top: -50px;
        left: -230px;
        overflow: hidden;
   }

</style>
</head>
<body>
<div>
	<h2>Search Book </h2>
	<form action="searchbook" method="post">
		<tr><td>By Title</td><td><input type="text" name="btitle"></td></tr>
		<tr><td><input type="submit" value="Search"/></td></tr>
		<tr><td>By Author</td><td><input type="text" name="bauthor"></td></tr>
		<tr><td><input type="submit" value="Search"/></td></tr>
	</form>
</div>
	<%
		
	%>
</body>
</html>