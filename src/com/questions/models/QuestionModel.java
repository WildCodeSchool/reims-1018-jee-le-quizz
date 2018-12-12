package com.questions.models;

import com.questions.beans.Question;

public class QuestionModel {
	public QuestionModel() {
		
	}

	public Question getFirstQuestion() {
		return new Question(1, "première question");
	}

	public Question getQuestionByIndex(int index) {
		return new Question(index, "question numéro " + index);
	}
}
