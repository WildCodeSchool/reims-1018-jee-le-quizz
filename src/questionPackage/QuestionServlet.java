package questionPackage;

import java.net.*;
import java.util.*;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;

import fr.wildcodeschool.Question;


/**
 * Servlet implementation class QuestionServlet
 */
@WebServlet("/question")
public class QuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuestionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		/*String test = Quizz.Hello();
		
		request.setAttribute( "sentence", test );
	       getServletContext().getRequestDispatcher("/WEB-INF/question.jsp")
	        .forward(request,response);*/
	    
	    URL url = new URL("https://my-json-server.typicode.com/l-alexis/JsonFileProject2/db");
		HttpURLConnection connect = (HttpURLConnection) url.openConnection();
		connect.setRequestMethod("GET");
		int status = connect.getResponseCode();
		BufferedReader in = new BufferedReader(
				  new InputStreamReader(connect.getInputStream()));
		String inputLine;
		StringBuffer content = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
		    content.append(inputLine);
		}
		in.close();
		connect.disconnect();
		response.getWriter().append(content);
		FileReader jsonFile = null;
		jsonFile = new FileReader(content.toString());
		JSONParser parser = new JSONParser(jsonFile);
	    Object jsonParsed = null;
	    try {
	      jsonParsed = parser.parse();
	    } catch (ParseException e) {
	      e.printStackTrace();
	    }
	    
	    JSONArray root = (JSONArray) jsonParsed;
	    this.questionsTable = new ArrayList <Question>();
	    for (int i=0;i<root.size();i++){
	      List<String> answers = new ArrayList<String>();
	      JSONObject questionObject = (JSONObject)root.get(i);
	      String realQuestion = (String) questionObject.get("content");
	      int idQuestion= Math.toIntExact ( (long) questionObject.get("id") );
	      JSONArray answersQuestion = (JSONArray) questionObject.get("answers");
	      for (int j = 0; j < answersQuestion.size(); j++) {
	          String answer = (String) answersQuestion.get(j);
	          answers.add(answer);
	        }
	      Question question= new Question (idQuestion, realQuestion, answers);
	      this.questionsTable.add(question);

	    
	    
	    
	    
	    /* if (jsonParsed != null){
	    	response.getWriter().append(content);
	    } 
	    else {
	    	System.out.println("Nonono");
	    } */
				
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//String test = Quizz.texte();
	}
	

}
