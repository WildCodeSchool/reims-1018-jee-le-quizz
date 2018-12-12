package com.Question.Read;

public class Post {
	private int id;
	private String title;
	private String content;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private String rightAnswer;
	


	public Post (int id, String title, String content, String answer1, String answer2, String answer3, String answer4, String rightAnswer){
		this.id = id;
		this.title = title;
		this.content = content;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		this.rightAnswer = rightAnswer;
	}
	
	public int getId () {
		return this.id;
	}
	
	public void setId (int id) {
		this.id = id;
	}
	
	public String getTitle () {
		return this.title;
	}
	
	public void setTitle (String title) {
		this.title = title;
	}
	
	public String getContent () {
		return this.content;
	}
	
	public void setContent (String content) {
		this.content = content;
	}

	public String getAnswer1() {
		return this.answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getAnswer2() {
		return this.answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public String getAnswer3() {
		return this.answer3;
	}

	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}

	public String getAnswer4() {
		return this.answer4;
	}

	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}

	public String getRightAnswer() {
		return this.rightAnswer;
	}

	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	
	public static String goodChoice() {
		return "It's good !";
	}

	public static String badChoice() {
		return "It's not good !";
	}
}