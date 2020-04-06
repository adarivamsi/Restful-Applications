package com.adarivamsi.friends.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.adarivamsi.friends.service.FriendService;

@RestController
public class FriendController {
	@Autowired
	FriendService friendService;
}
