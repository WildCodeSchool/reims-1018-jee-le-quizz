package questionPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdQuestion
 */
@WebServlet("/Question3")
public class ThirdQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdQuestion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String teste = Quizz.thirdQuestion();
		String answerThird1 = Quizz.thirdAnswer1();
		String answerThird2 = Quizz.thirdAnswer2();
		String answerThird3 = Quizz.thirdAnswer3();
		String answerThird4 = Quizz.thirdAnswer4();
		//request.setAttribute( "noice", answer );
		request.setAttribute( "sentence", teste );
		request.setAttribute( "answer1", answerThird1 );
		request.setAttribute( "answer2", answerThird2 );
		request.setAttribute( "answer3", answerThird3 );
		request.setAttribute( "answer4", answerThird4 );
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
