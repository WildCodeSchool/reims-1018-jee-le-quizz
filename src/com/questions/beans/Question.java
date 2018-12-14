package com.questions.beans;

import java.util.List;

public class Question {
	private int index;
	private String title;
	private String content;
	private List<String> answers;
	
	public Question(int index, String title, String content, List<String> answers) {
		this.index = index;
		this.title = title;
		this.content = content;
		this.answers = answers;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle (String title) {
		this.title = title;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public List<String> getAnswers() {
		return this.answers;
	}
	
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
}
