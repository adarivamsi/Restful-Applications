package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Message;

@RestController
public class MessageController {
	@GetMapping("/message")
	Message send() {
		return new Message("First Message");
	}
	@PostMapping("/message")
	Message echo (@RequestBody Message msg) {
		return msg;
	}
}
