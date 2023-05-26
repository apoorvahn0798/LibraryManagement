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
        background-image: url(https://images.pexels.com/photos/1329571/pexels-photo-1329571.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1);
        background-size: cover;
        background-repeat: no-repeat;
   }
   
   div{
   		margin-left:500px;
   		border: 2px solid rgb(110, 108, 108);
        border-radius: 5px;
        padding: 20px;
        background-color: rgb(178, 177, 240);
        height: 300px;
        width: 320px;
        top: -50px;
        left: -230px;
        overflow: hidden;
   
   }
   </style>
</head>
<body>
<div >
					<h2 align=center> Book Details</h2>                 
					
					
				  <p align=center><a href="getallbooks "> View All Books</a><p>
					
	<form action="saveBook" method="post">
	<table>
	<tr><td>Book Id</td><td><input type="text" name="bookid"/></td></tr>
	<tr><td>Title</td><td><input type="text" name="btitle"/></td></tr>
	<tr><td>Author</td><td><input type="text" name="bauthor"/></td></tr>
	<tr><td>publisher</td><td><input type="text" name="bpublisher"/></td></tr>
	<tr><td>Edition</td><td><input type="text" name="bedition"/></td></tr>
	<tr><td>Copies</td><td><input type="text" name="bcopies"/></td></tr>
	<tr><td><input type="submit" name="Save"/></td></tr>
	</table>
	</form>
	
	<%
		if(request.getAttribute("msg")!=null){
		out.println(request.getAttribute("msg"));
		}
		%>
</div>
</body>
</html>