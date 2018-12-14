package com.questions.models;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import com.questions.beans.Question;

public class QuestionModel {
	
	private ArrayList<Question> questions;
	
	public QuestionModel() {
		
		this.questions= new ArrayList<Question>();
		
		Object jsonParsed = null;
		try {
			URL url = new URL("https://my-json-server.typicode.com/blackadder2509/json2/Questions");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			int status = connection.getResponseCode();
			InputStreamReader in = new InputStreamReader(connection.getInputStream());
			JSONParser parser = new JSONParser();
			jsonParsed = parser.parse(in);
			connection.disconnect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JSONArray root = (JSONArray) jsonParsed;
		
		for (int i = 0; i < root.size(); i++) {
			JSONObject questionsObject = (JSONObject) root.get(i);
			String title = (String) questionsObject.get("title");
			String content = (String) questionsObject.get("content");
			int rightAnswer = Math.toIntExact((long) questionsObject.get("right_answer"));
			JSONArray jsonAnswers = (JSONArray)questionsObject.get("answers");
			List<String> answers = new ArrayList<String>();
			for (int j = 0; j < jsonAnswers.size(); j++) {
				String answer = (String) jsonAnswers.get(j);
				answers.add(answer);
			}
			this.questions.add(new Question(i, title, content, answers, rightAnswer));
		}
			

	}

	public Question getFirstQuestion() {
		return this.questions.get(0);
	}

	public Question getQuestionByIndex(int index) {
		return this.questions.get(index);
	}

	public int getQuestionCount() {
		return this.questions.size();
	}
}
