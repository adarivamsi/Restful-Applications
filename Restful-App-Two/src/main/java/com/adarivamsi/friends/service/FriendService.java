package com.adarivamsi.friends.service;

import org.springframework.data.repository.CrudRepository;

import com.adarivamsi.friends.model.Friend;

public interface FriendService extends CrudRepository<Friend, Integer>{
	
}
