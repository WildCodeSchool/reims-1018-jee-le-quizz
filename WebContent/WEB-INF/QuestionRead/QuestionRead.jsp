<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>    
<%@ page import="com.Question.Read.Post" %>
<% Post post = (Post) request.getAttribute("post"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><%= post.getTitle() %></h1>
<p><%= post.getContent() %></p>
<button class="favorite styled" type="button" name="Choice" value="A"><%= post.getAnswer1() %></button>
<button class="favorite styled" type="button" name="Choice" Value="B"><%= post.getAnswer2() %></button>
<button class="favorite styled" type="button" name="Choice" Value="C"><%= post.getAnswer3() %></button>
<button class="favorite styled" type="button" name="Choice" Value="D"><%= post.getAnswer4() %></button>
</body>
</html>