<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.questions.beans.Question" %>
<% Question question = (Question) request.getAttribute("question"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Question <%= question.getIndex() %></title>
</head>
<body>
<%= question.getContent() %>
<form action="<%= request.getContextPath() %>/questions/check-answer" method="post">
<input type="hidden" name="id" value="<%= question.getIndex() %>">
<input type="submit" value="c'est mon dernier mot Jean-Pierre">
</form>
</body>
</html>