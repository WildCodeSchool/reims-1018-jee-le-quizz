package com.questions.beans;

public class Question {
	private int index;
	private String content;
	private String title;
	private String answers;
	private int rightAnswer;
	
	public Question(int index, String content, String title, String answers, int rightAnswer) {
		this.index = index;
		this.content = content;
		this.title = title;
		this.answers = answers;
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
		return this.answers;
	}

	public int getRightAnswer() {
		return rightAnswer;
	}
		
	public void setRightAnswer(int rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	
}
