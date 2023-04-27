package com.example.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.User;
import com.example.repository.UserRepo;

public class userService {
	@Autowired
	UserRepo userRepo;
	public List<User> getAll(){
		return userRepo.findAll();
	}
	public boolean login(Map<String,String> allParams) {
		List<User> lstUser = userRepo.findAll();
			for(User i:lstUser) {
				if(i.getName().equals(allParams.get("username"))
				   && i.getPassword().equals(allParams.get("password")))
					  return true;
		}
		return false;
	}
	public void signup(Map<String,String> allParams) {
			User usernew= new User();
			usernew.setName(allParams.get("nameSignup"));
			usernew.setPassword(allParams.get("password"));
			userRepo.save(usernew);
	}
}
