package com.example.Quiz.Application.repository;

import com.example.Quiz.Application.Entity.QuizAttempt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizAttemptRepository extends JpaRepository<QuizAttempt, Long> {}
