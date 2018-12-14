package com.questions;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.questions.beans.Question;
import com.questions.models.QuestionModel;

/**
 * Servlet implementation class CheckAnswerServlet
 */
@WebServlet("/questions/check-answer")
public class CheckAnswerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckAnswerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QuestionModel questionModel = new QuestionModel();
		
		int answer = Integer.valueOf(request.getParameter("choice"));
		
		int index = Integer.valueOf(request.getParameter("id"));
		Question question = questionModel.getQuestionByIndex(index);
		
		boolean isOk = (answer == question.getRightAnswer());
		
		if(isOk) {
			int nextIndex = index+1;
			boolean hasNextQuestion = (nextIndex < questionModel.getQuestionCount());
			
			if(hasNextQuestion) {
				response.sendRedirect(request.getContextPath() + "/questions?id=" + nextIndex);
			}
			else {
				response.sendRedirect(request.getContextPath() + "/win");
			}
		}
		else {
			response.sendRedirect(request.getContextPath() + "/lose");
		}
	}

}
