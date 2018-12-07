package questionPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstQuestion
 */
@WebServlet("/Question1")
public class FirstQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstQuestion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    String test = Quizz.firstQuestion();
		String answer1 = Quizz.answer1();
		String answer2 = Quizz.answer2();
		String answer3 = Quizz.answer3();
		String answer4 = Quizz.answer4();
				request.setAttribute( "answer1", answer1 );
				request.setAttribute( "answer2", answer2 );
				request.setAttribute( "answer3", answer3 );
				request.setAttribute( "answer4", answer4 );
				request.setAttribute( "sentence", test );
			       getServletContext().getRequestDispatcher("/WEB-INF/question.jsp")
			        .forward(request,response);
			       
					
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
