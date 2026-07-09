package com.cognizant.jwt_handson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestHeader;
import com.cognizant.jwt_handson.model.AuthenticationResponse;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.springframework.web.bind.annotation.RequestHeader;
import com.cognizant.jwt_handson.util.JwtUtil;

@RestController
public class AuthenticationController {

	@GetMapping("/authenticate")
	public AuthenticationResponse authenticate(
	        @RequestHeader("Authorization") String authHeader) {

	    System.out.println("Authorization Header: " + authHeader);

	    // Remove "Basic "
	    String encodedCredentials = authHeader.substring(6);

	    // Decode Base64
	    byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);

	    String decodedCredentials =
	            new String(decodedBytes, StandardCharsets.UTF_8);

	    System.out.println(decodedCredentials);

	    String[] values = decodedCredentials.split(":");

	    String username = values[0];
	    String password = values[1];

	    System.out.println("Username : " + username);
	    System.out.println("Password : " + password);

	    String token = JwtUtil.generateToken(username);

	    return new AuthenticationResponse(token);
	}
}