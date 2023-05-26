<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file= "Logout.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All books</title>
<style>
body{
        background-image: url(https://images.pexels.com/photos/1261180/pexels-photo-1261180.jpeg?auto=compress&cs=tinysrgb&w=600);
        background-size: cover;
        background-repeat: no-repeat;
   }
   div{
   margin-left:200px;
   background-color: white;
   height: 300px;
        width: 1000px;
   }
</style>

</head>
<body>
<div align=center>
		<h2> All Books</h2>
		<table border='1'>
			<tr>
				<th>Book Id</th>
				<th>Title </th>
				<th>Author</th>
				<th>Publisher</th>
				<th>Edition</th>
				<th>Copies</th>
				<th>Delete</th>
				<th>Update</th>
			</tr>
			<%
			ResultSet result =(ResultSet)request.getAttribute("result");
			while(result.next()){
			%>
			<tr>
				<td><%=result.getString(1) %></td>
				<td><%=result.getString(2) %></td>
				<td><%=result.getString(3) %></td>
				<td><%=result.getString(4) %></td>
				<td><%=result.getString(5) %></td>
				<td><%=result.getString(6) %></td>
				<td><a href="delete?title=<%=result.getString(2) %>">Delete</a></td>
				<td><a href="update?bookid=<%=result.getString(1)%>&btitle=<%=result.getString(2) %>&bauthor=<%=result.getString(3) %>&bpublisher=<%=result.getString(4) %>&bedition=<%=result.getString(5) %>&bcopies=<%=result.getString(6) %>"> Update </a></td>
			</tr>
			<%
			}
			%>
		</table>
</div>
</body>
</html>