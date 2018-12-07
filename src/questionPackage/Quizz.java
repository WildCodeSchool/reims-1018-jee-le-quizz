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
	
	

	public static String Hello () {
		return "Qui veut gagner des Gallions ?";
	}
	

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
		return "Ravenclaw house";
	}
	
	public static String secondAnswer3 () {
		return "Gryffindor House";
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
	
	public static String youLoose () {
		return "Oh noooo, You loose ! Go back with the muggles!";
	}
}
