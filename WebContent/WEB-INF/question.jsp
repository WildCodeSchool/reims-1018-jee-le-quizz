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
<a href="http://localhost:8080/Quizz-Qui-veux-gagner-des-gallions/Question4"><button><% String attribut1 = (String) request.getAttribute("answer1");%><% out.println(attribut1); %></button></a>
<a href="http://localhost:8080/Quizz-Qui-veux-gagner-des-gallions/Question3"><button><% String attribut2 = (String) request.getAttribute("answer2");%><% out.println(attribut2); %></button></a>
<a href="http://localhost:8080/Quizz-Qui-veux-gagner-des-gallions/Question2"><button><% String attribut3 = (String) request.getAttribute("answer3");%><% out.println(attribut3); %></button></a> 
<a href=""><button><% String attribut4 = (String) request.getAttribute("answer4");%><% out.println(attribut4); %></button></a>

</body>
</html>