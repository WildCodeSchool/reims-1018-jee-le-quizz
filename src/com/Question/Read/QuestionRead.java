package com.Question.Read;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import questionPackage.Quizz;

/**
 * Servlet implementation class QuestionRead
 */
@WebServlet("/posts")
public class QuestionRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private QuestionSource postManager;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuestionRead() {
        super();
        this.postManager = new QuestionSource();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
      if(request.getParameter("id") == null ) {
        	request.setAttribute("posts", this.postManager.getAllPosts());
        	
        	this.getServletContext().getRequestDispatcher("/WEB-INF/QuestionRead/Post.jsp").forward(request, response);
        }
        else {
        	request.setAttribute("post",
        			this.postManager.getPostById(
        					Integer.parseInt(request.getParameter("id"))
        					)
        			);

        	/* if(getRightAnswer.equals(request.getParameter("Choice"))) {

        		
        		
        	}else {
        		
        	} */
        	
        	this.getServletContext().getRequestDispatcher("/WEB-INF/QuestionRead/QuestionRead.jsp").forward(request, response);
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
