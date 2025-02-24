//package com.example.Quiz.Application;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class QuizApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(QuizApplication.class, args);
//	}
//
//}
package com.example.Quiz.Application;

import com.example.Quiz.Application.Entity.User;
import com.example.Quiz.Application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class QuizApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
	}

	@Override
	public void run(String... args) {
		if (userRepository.findByUsername("admin").isEmpty()) {
			User admin = new User();
			admin.setUsername("admin");
			admin.setPassword(passwordEncoder.encode("admin123"));  // Store encoded password
			admin.setRole("ADMIN");
			userRepository.save(admin);
			System.out.println("Admin user created successfully!");
		}
	}
}
