/**
 * 
 */
package com.vti.entity;

/**
 * @author luant
 *
 */
public class Answer {
	private int answerId;
	private String content;
	private Question questionId;
	private String isCorrect;
	
	public Answer() {
		
	}

	public Answer(int answerId, String content, Question questionId, String isCorrect) {
		
		this.answerId = answerId;
		this.content = content;
		this.questionId = questionId;
		this.isCorrect = isCorrect;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Question getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Question questionId) {
		this.questionId = questionId;
	}

	public String getIsCorrect() {
		return isCorrect;
	}

	public void setIsCorrect(String isCorrect) {
		this.isCorrect = isCorrect;
	}
	
	
	
	
	
	
}
