package questionPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FourthQuestion
 */
@WebServlet("/Question4")
public class FourthQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FourthQuestion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String teste = Quizz.secondQuestion();
		String answerFourth1 = Quizz.fourthAnswer1();
		String answerFourth2 = Quizz.fourthAnswer2();
		String answerFourth3 = Quizz.fourthAnswer3();
		String answerFourth4 = Quizz.fourthAnswer4();
		request.setAttribute( "sentence", teste );
		request.setAttribute( "answer1", answerFourth1 );
		request.setAttribute( "answer2", answerFourth2 );
		request.setAttribute( "answer3", answerFourth3 );
		request.setAttribute( "answer4", answerFourth4 );
	       getServletContext().getRequestDispatcher("/WEB-INF/Question4.jsp")
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
