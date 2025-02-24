package com.example.Quiz.Application.repository;

import com.example.Quiz.Application.Entity.Option;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepository extends JpaRepository<Option, Long> {

}
