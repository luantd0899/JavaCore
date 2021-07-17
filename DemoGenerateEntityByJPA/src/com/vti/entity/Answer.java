package com.vti.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the answer database table.
 * 
 */
@Entity
@Table(name="answer")
@NamedQuery(name="Answer.findAll", query="SELECT a FROM Answer a")
public class Answer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private byte answers;

	@Column(nullable=false, length=100)
	private String content;

	private byte isCorrect;

	//bi-directional many-to-one association to Question
	@ManyToOne
	@JoinColumn(name="QuestionID", nullable=false)
	private Question question;

	public Answer() {
	}

	public byte getAnswers() {
		return this.answers;
	}

	public void setAnswers(byte answers) {
		this.answers = answers;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public byte getIsCorrect() {
		return this.isCorrect;
	}

	public void setIsCorrect(byte isCorrect) {
		this.isCorrect = isCorrect;
	}

	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

}