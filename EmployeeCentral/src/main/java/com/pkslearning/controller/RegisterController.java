package com.pkslearning.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pkslearning.dao.RegisterDao;
import com.pkslearning.entity.LoginRequest;
import com.pkslearning.entity.LoginResponse;
import com.pkslearning.entity.Register;
import com.pkslearning.service.RegisterService;

@RequestMapping("/api/empcentral")
@RestController
public class RegisterController {

	@Autowired
	private RegisterService registerservice;
	
	
	
	@PostMapping("/register")
	public ResponseEntity<?> registerUser(@RequestBody Register newUser)
	{
		try {
			registerservice.registerUser(newUser);
			Map<String, String> response = new HashMap<>();
	        response.put("message", "User registered successfully");
	        return ResponseEntity.ok(response);
		}catch(Exception e)
		{
			Map<String, String> errorResponse = new HashMap<>();
	        errorResponse.put("error", e.getMessage());
	        return ResponseEntity.badRequest().body(errorResponse);
		}
		
	}
	
	
	
	  @PostMapping("/login")
	    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
	        Register user = registerservice.login(
	                loginRequest.getEmail(), loginRequest.getPassword());

	        if (user != null) {
	            return ResponseEntity.ok(new LoginResponse(user.getRole()));
	        } else {
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
	        }
	    }
	}
	
	


