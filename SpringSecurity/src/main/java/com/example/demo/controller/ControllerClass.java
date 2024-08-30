package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.securityConfig.JWTUtils;
import com.example.demo.securityConfig.LoginRequest;
import com.example.demo.securityConfig.LoginResponse;

@RestController
public class ControllerClass {
	
//    @Autowired
//    private JWTUtils jwtUtils;
//
//   // @Autowired
//    private AuthenticationManager authenticationManager;
//    
	
	@PreAuthorize("hasRole('USER')")
	@GetMapping("/user")
	public String greet()
	{
		return "Hello Venkatesh from User";
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/admin")
	public String greetfromAdmin()
	{
		return "Hello Venkatesh Greeting from admin";
	}
	
	
	
//	 @PostMapping("/signin")
//	    public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
//	        Authentication authentication;
//	        try {
//	            authentication = authenticationManager
//	                    .authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
//	        } catch (AuthenticationException exception) {
//	            Map<String, Object> map = new HashMap<>();
//	            map.put("message", "Bad credentials are Provided");
//	            map.put("status", false);
//	            return new ResponseEntity<Object>(map, HttpStatus.NOT_FOUND);
//	        }
//
//	        SecurityContextHolder.getContext().setAuthentication(authentication);
//
//	        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
//
//	        String jwtToken = jwtUtils.generateTokenFromUsername(userDetails);
//
//	        List<String> roles = userDetails.getAuthorities().stream()
//	                .map(item -> item.getAuthority())
//	                .collect(Collectors.toList());
//
//	        LoginResponse response = new LoginResponse(userDetails.getUsername(), roles, jwtToken);
//
//	        return ResponseEntity.ok(response);
//	    }


}
