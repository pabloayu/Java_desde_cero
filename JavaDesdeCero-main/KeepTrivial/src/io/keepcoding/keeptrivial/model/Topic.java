package io.keepcoding.keeptrivial.model;

import java.util.ArrayList;

public class Topic {
	private String topicName;
	private ArrayList<Question> questionList;

	public Topic(String topicName) {
		this.topicName = topicName;
		this.questionList = new ArrayList<>();
	}
	
	public void addQuestion(Question question) {
		questionList.add(question);
	}
	
	public String getTopicName() {
		return topicName;
	}
	
	public ArrayList<Question> getQuestionList() {
		return questionList;
	}
	
	
	public boolean equals(Object o) {
		return o instanceof Topic && topicName.equals(((Topic) o).topicName);
	}
	
}
