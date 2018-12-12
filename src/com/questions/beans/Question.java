package com.questions.beans;

public class Question {
	private int index;
	private String content;
	private String title;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private String rightAnswer;
	
	public Question(int index, String content, String title, String answer1, String answer2, String answer3, String answer4, String rightAnswer) {
		this.index = index;
		this.content = content;
		this.title = title;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		this.rightAnswer = rightAnswer;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getTitle() {
		return this.title;
	}

	public void setTitle (String title) {
		this.title = title;
	}

	public String getAnswer1() {
		return this.answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}
	
	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	
	public String getAnswer3() {
		return answer3;
	}

	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}
	
	public String getAnswer4() {
		return answer4;
	}

	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}
	
	public String getRightAnswer() {
		return rightAnswer;
	}
		
	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	
}
