<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.questions.beans.Question" %>
<% Question question = (Question) request.getAttribute("question"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Question <%= question.getIndex() %></title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/QuestionIndex.css">
</head>
<body>
<h1 class="text-center"> Who wants to win galleons ?</h1>

<p><%= question.getContent() %></p>

<form class="formulaire-questions text-center" action="<%= request.getContextPath() %>/questions/check-answer" method="post">
<input class="text-center" type="hidden" name="id" value="<%= question.getIndex() %>">
<% int i = 1; %>
<% for(String answer : question.getAnswers()) {%>
<div>
	<label><input type="radio" name="choice" value="<%= i %>"> <%= answer %></label>
</div>
<% i++; %>
<% } %>
<input class="text-center last-word" type="submit" value="This is my last word, Dumbledore">
</form>
<h2 class="text-center">Find the good answer to continue the Quizz or you may go back home</h2>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>
