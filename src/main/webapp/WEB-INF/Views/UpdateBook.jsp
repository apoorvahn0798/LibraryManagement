<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file= "Logout.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="update" method="post">
		Book Id<input type="text" name="bookid" value="<%=request.getAttribute("bookid")%>"/>
		Title<input type="text" name="btitle" value="<%=request.getAttribute("btitle")%>"/>
		author<input type="text" name="bauthor" value="<%=request.getAttribute("bauthor")%>"/>
		publisher<input type="text" name="bpublisher" value="<%=request.getAttribute("bpublisher")%>"/>
		Edition<input type="text" name="bedition" value="<%=request.getAttribute("bedition")%>"/>
		Copies<input type="text" name="bcopies" value="<%=request.getAttribute("bcopies")%>"/>
		<input type="submit" name="Update"/>
	
	</form>

</body>
</html>