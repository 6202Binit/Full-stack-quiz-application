//package com.example.Quiz.Application.repository;
//
//import com.example.Quiz.Application.Entity.Question;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//
//public interface QuestionRepository extends JpaRepository<Question, Long> {}


package com.example.Quiz.Application.repository;

import com.example.Quiz.Application.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByQuizId(Long quizId);  // ✅ Add this method
}
