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
<button type="button" ><a href ="<%= request.getContextPath() %>/index.html"><img alt="way" src="https://images-na.ssl-images-amazon.com/images/I/61nvlIKia-L._SY355_.jpg"></a></button>
<button type="button"><a href ="<%= request.getContextPath() %>/questions"><img alt ="road" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTmYG3Y5t9TSSLYG8nlMTpWdU_M1fa-kEJAgsErXGeAzbRm7LQ8"></a></button>
</body>
</html>