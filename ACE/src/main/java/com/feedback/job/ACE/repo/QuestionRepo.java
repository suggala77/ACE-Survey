package com.feedback.job.ACE.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.feedback.job.ACE.entity.Question;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface QuestionRepo extends JpaRepository<Question, Integer> {
	
	@Modifying
	@Query("update Question set qAns=:qAns  where qNumber=:qNum and userId=:userId")
	public int updateQuestion(@Param("qAns")int qAns, @Param("qNum")int qNum,@Param("userId")int userId);
}
