package com.feedback.job.ACE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.feedback.job.ACE.entity.Question;
import com.feedback.job.ACE.repo.QuestionRepo;

@RestController
@CrossOrigin(origins = "*")
public class QuestionController {

	@Autowired
	QuestionRepo repo;
	
	@GetMapping("/questions")
	public List<Question> getQuestion() {
		return repo.findAll();
	}
	
	@PostMapping("/questions")
	public ResponseEntity<List<Question>> updateQuestion(@RequestBody List<Question> qList) {
		List<Question> list = null;
		try {
			list = repo.saveAll(qList);
			
			if(list != null && list.isEmpty())
				return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(null);
		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(list);
	
	}
	
}
