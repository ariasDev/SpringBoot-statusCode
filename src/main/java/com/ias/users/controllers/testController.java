package com.ias.users.controllers;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/testServerController")
public class testController {
	
	@GetMapping(path = "", produces = "application/json")
	public ResponseEntity<Object> testServerAvailability() {
		HashMap<String, Object> response = new HashMap<>();
		response.put("response", "Server Ok");
		 return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
