package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.GreetClient;

@RestController
public class WelcomeController {

	@Autowired
	private GreetClient client;

	@GetMapping("/welcome")
	public String welcome() {

		return client.invokeGreetApi() + " " + "Welcome to Marvel's Multiverse!!";
	}

}
