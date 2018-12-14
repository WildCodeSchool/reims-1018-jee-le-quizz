<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Game Over !</title>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/Loose.css">
</head>
<body>
<h1>GAME OVER !</h1>
<p> Sorry my friend, we'll have to take the big room to retry your luck, where you can use the way 9 3/4 if you prefer to go home..</p>
<a href ="<%= request.getContextPath() %>/questions"><button type="button" id="bigRoom"></button></a>
<a href ="<%= request.getContextPath() %>/index.html"><button type="button" id="way"></button></a>
</body>
</html>