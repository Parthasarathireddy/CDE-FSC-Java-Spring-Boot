package com.cts.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.registration.model.User;
import com.cts.registration.service.RegistrationService;

@RestController
public class RegistrationController {
	
	@Autowired
	private RegistrationService service;
	
	@PostMapping("/registeruser")
	@CrossOrigin(origins = "http://localhost:4200")
	public User registerUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getEmailId();
		if(tempEmailId != null && !"".equals(tempEmailId)) {
			User userObj = service.fetchUserByEmailId(tempEmailId);
			if(userObj != null) {
				throw new Exception("User with " + tempEmailId + " is already Exist");
			}
		}
		User userObj = null;
		userObj = service.saveUser(user);
		return userObj;
	}
	
	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmailid = user.getEmailId();
		String tempPassword = user.getPassword();
		User userObj = null;
		if(tempEmailid != null && tempPassword != null) {
			userObj = service.fetchUserByEmailIdAndPassword(tempEmailid, tempPassword);
		}
		if(userObj == null) {
			throw new Exception("bad credentials");
		}
		return userObj;
	}
	
}
