package com.feedback.job.ACE.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="questions")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name="q_id")
	int qId;

	@Column(name="q_number")
	int qNumber;
	
	@Column(name="q_ans")
	int qAns;
	
	@Column(name="q_text")
	String qText;
	
	@Column(name="user_id")
	int userId;
	
	

	public Question() {
	}

	public Question(int qNumber, int qAns, String qText, int userId) {
		
		this.qNumber = qNumber;
		this.qAns = qAns;
		this.qText = qText;
		this.userId = userId;
	}


	public int getqNumber() {
		return qNumber;
	}

	public void setqNumber(int qNumber) {
		this.qNumber = qNumber;
	}

	public int getqAns() {
		return qAns;
	}

	public void setqAns(int qAns) {
		this.qAns = qAns;
	}

	public String getqText() {
		return qText;
	}

	public void setqText(String qText) {
		this.qText = qText;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
