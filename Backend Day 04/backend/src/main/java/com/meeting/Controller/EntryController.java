package com.meeting.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.meeting.DTO.AuthenticationRequest;
import com.meeting.DTO.AuthenticationResponse;
import com.meeting.DTO.RegisterRequest;
import com.meeting.Service.EntryService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/api/entry")
@RequiredArgsConstructor
public class EntryController {

	@Autowired
	EntryService eService;
	
	
	@Operation(summary = "sign up a new user and add details in user table")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "new user added successfully"),
			@ApiResponse(responseCode = "400", description = "User already exist")
	})
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(value = "/post",  consumes = "application/json")
	public ResponseEntity<AuthenticationResponse> CreateNewUser(@RequestBody RegisterRequest request) {
		
		return ResponseEntity.ok(eService.CreateNewUser(request));
	}

	
	
	
	@Operation(summary = "Get user details for sign in validation")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Successfully loged in"),
			@ApiResponse(responseCode = "400", description = "Could not log in")
	})
	@ResponseStatus(HttpStatus.OK)
	@PostMapping(value = "/auth_user")
	public ResponseEntity<AuthenticationResponse> validateUser(@RequestBody AuthenticationRequest request) {

		return ResponseEntity.ok(eService.validateUser(request));
	}
	
	
	
}