<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Qui veut gagner des gallions ?</title>
</head>
<body>
<p> 
<% String attribut = (String) request.getAttribute("sentence");%>
<% out.println(attribut); %>
</p>
</body>
</html>