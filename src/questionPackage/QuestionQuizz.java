package questionPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;

class QuestionQuizz {
	
	/*public QuestionQuizz () {
		
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
		FileReader jsonFile = null;
		jsonFile = new FileReader(content.toString());
		JSONParser parser = new JSONParser(jsonFile);
	    Object jsonParsed = null;
	    try {
	      jsonParsed = parser.parse();
	    } catch (ParseException e) {
	      e.printStackTrace();
	    }
	    if (jsonParsed != null){
	      System.out.println("le parse a réussi!");
	    } 
	    else {
	    	System.out.println("Nonono");
	    }
	} */

}
