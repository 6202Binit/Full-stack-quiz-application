//package com.example.Quiz.Application.controller;
//import com.example.Quiz.Application.security.JwtUtil;
//import com.example.Quiz.Application.service.CustomUserDetailsService;
//import com.example.Quiz.Application.Entity.User;
//import com.example.Quiz.Application.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/auth")
//public class AuthController{
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private JwtUtil jwtUtil;
//
//    @Autowired
//    private CustomUserDetailsService userDetailsService;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody User request) {
//        authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
//        );
//
//        UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUsername());
//        String token = jwtUtil.generateToken(userDetails.getUsername());
//
//        return ResponseEntity.ok(token);
//    }
//}








package com.example.Quiz.Application.controller;

import com.example.Quiz.Application.security.JwtUtil;
import com.example.Quiz.Application.dto.LoginRequest;
import com.example.Quiz.Application.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @PostMapping("/login")  // ✅ Correct method mapping
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
        );

        UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUsername());
        String token = jwtUtil.generateToken(userDetails.getUsername());

        return ResponseEntity.ok(token);
    }


//    @PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
//        UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUsername());
//
//        // ✅ Verify password before authentication
//        if (!passwordEncoder.matches(request.getPassword(), userDetails.getPassword())) {
//            return ResponseEntity.status(401).body("Invalid username or password");
//        }
//
//        authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
//        );
//
//        String token = jwtUtil.generateToken(userDetails.getUsername());
//        return ResponseEntity.ok(token);
//    }
}
