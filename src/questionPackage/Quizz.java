package questionPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Quizz {
	
	//private static ArrayList <Question> questionsTable ;
	

	public static String Hello () {
		return "Qui veut gagner des Gallions ?";
	}
	
	/*public static void test () {
		System.out.println("le parse a réussi!");
	}
	*/
	public static String firstQuestion () {
		return "Which sport does the young Harry Potter practice while studying at Hogwarts?";
	}
	
	public static String answer1 () {
		return "Ice-skate";
	}
	
	public static String answer2 () {
		return "Wolf hunting";
	}
	
	public static String answer3 () {
		return "Quidditch";
	}
	
	public static String answer4 () {
		return "Football";
	}
	
	public static String secondQuestion () {
		return "Which of these houses does not belong to Hogwarts?";
	} 
	
	public static String secondAnswer1 () {
		return "Hufflepuff House";
	}
	
	public static String secondAnswer2 () {
		return "Gryffindor House";
	}
	
	public static String secondAnswer3 () {
		return "Ravenclaw house";
	}
	
	public static String secondAnswer4 () {
		return "Slytherin House";
	}
	
	public static String thirdQuestion () {
		return "What spell can levitate an object?";
	} 
	
	public static String thirdAnswer1 () {
		return "Levitation Charm";
	}
	
	public static String thirdAnswer2 () {
		return "Summoning Charm";
	}
	
	public static String thirdAnswer3 () {
		return "Stupefy";
	}
	
	public static String thirdAnswer4 () {
		return "Voleti Voleta";
	}
	
	public static String fourthQuestion () {
		return "Who is the director of Hogwarts in the first year of Harry Potter?";
	} 
	
	public static String fourthAnswer1 () {
		return "Albus Dumbledore";
	}
	
	public static String fourthAnswer2 () {
		return "Rubeus Hagrid"	;
	}
	
	public static String fourthAnswer3 () {
		return "Dolores Jane Umbridge";
	}
	
	public static String fourthAnswer4 () {
		return "Voleti Voleta";
	}
	/*
	
	public Quizz () throws IOException {
		 
		ArrayList <Question> questionsTable ;
	
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
		//response.getWriter().append(content);
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
	    //Quizz.questionsTable = new ArrayList <Question>();
	    for (int i=0;i<root.size();i++){
	      List<String> answers = new ArrayList<String>();
	      JSONObject questionObject = (JSONObject)root.get(i);
	      String realQuestion = (String) questionObject.get("content");
	      int idQuestion= Math.toIntExact ( (long) questionObject.get("id") );
	      JSONArray answersQuestion = (JSONArray) questionObject.get("answers1");
	      for (int j = 0; j < answersQuestion.size(); j++) {
	          String answer = (String) answersQuestion.get(j);
	          answers.add(answer);
	      }
	      Question question= new Question (idQuestion, realQuestion, answers);
	      Quizz.questionsTable.add(question);
       }
	    
	}
	
	  public Question getFirstQuestion (){
//	    return null;
	    return Quizz.questionsTable.get(0);
	  }
	*/
	
}
