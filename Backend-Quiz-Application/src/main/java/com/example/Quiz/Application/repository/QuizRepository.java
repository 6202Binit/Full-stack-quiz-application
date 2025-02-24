package com.example.Quiz.Application.repository;

import com.example.Quiz.Application.Entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
