package questionPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondQuestion
 */
@WebServlet("/Question2")
public class SecondQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondQuestion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String teste = Quizz.secondQuestion();
		String answerTwo1 = Quizz.secondAnswer1();
		String answerTwo2 = Quizz.secondAnswer2();
		String answerTwo3 = Quizz.secondAnswer3();
		String answerTwo4 = Quizz.secondAnswer4();
		request.setAttribute( "sentence", teste );
		request.setAttribute( "answer1", answerTwo1 );
		request.setAttribute( "answer2", answerTwo2 );
		request.setAttribute( "answer3", answerTwo3 );
		request.setAttribute( "answer4", answerTwo4 );
	       getServletContext().getRequestDispatcher("/WEB-INF/Question2.jsp")
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
