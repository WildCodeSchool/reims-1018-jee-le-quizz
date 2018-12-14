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
 * Servlet implementation class QuestionsServlet
 */
@WebServlet("/questions")
public class QuestionsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuestionsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		QuestionModel questionModel = new QuestionModel();
		
		Question question = null;
		
		if(request.getParameter("id") == null) {
			question = questionModel.getFirstQuestion();
		}
		else {
			int index = Integer.valueOf(request.getParameter("id"));
			question = questionModel.getQuestionByIndex(index);
		}
		
		request.setAttribute("question", question);

		this.getServletContext().getRequestDispatcher("/WEB-INF/questions/index.jsp").forward(request, response);
	}

}
