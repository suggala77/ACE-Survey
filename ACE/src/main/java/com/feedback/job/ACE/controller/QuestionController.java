package com.feedback.job.ACE.controller;

import java.net.http.HttpResponse;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.feedback.job.ACE.entity.Question;
import com.feedback.job.ACE.repo.QuestionRepo;

@RestController  
public class QuestionController {

	@Autowired
	QuestionRepo repo;
	
	@GetMapping("/questions")
	public List<Question> getQuestion() {
		return repo.findAll();
	}
	
	@PostMapping("/questions")
	public List<Question> updateQuestion(@RequestBody List<Question> qList) {
		return repo.saveAll(qList);
	
	}
	
}
