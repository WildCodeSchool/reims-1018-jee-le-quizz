package com.questions.beans;

public class Question {
	private int index;
	private String content;
	
	public Question(int index, String content) {
		this.index = index;
		this.content = content;
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
}
