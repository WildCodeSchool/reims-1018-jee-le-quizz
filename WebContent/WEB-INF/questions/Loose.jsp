<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Game Over !</title>
</head>
<body>
<h1>GAME OVER !</h1>
<p> Sorry my friend, we'll have to take the side road to retry your luck, where you can use the way 9 3/4 if you prefer to go home..</p>
<button type="button" ><a href ="<%= request.getContextPath() %>/index.html">way 9 3/4</a></button>
<button type="button"><a href ="<%= request.getContextPath() %>/questions">side road</a></button>
</body>
</html>