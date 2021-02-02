package com.cts.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.registration.model.Member;
import com.cts.registration.service.MemberService;

@RestController
public class MemberController {

	@Autowired
	private MemberService service;
	
	
	@PostMapping("/memberuser")
	@CrossOrigin(origins = "http://localhost:4200")
	public Member memberUser(@RequestBody Member member) {
		Member memberObj = service.saveMember(member);
		return memberObj;
	}
	
	@GetMapping("/allmember")
	@CrossOrigin(origins = "http://localhost:4200")
	@ResponseBody
	public List <Member> findAll() {
		List <Member> memberObj = service.findAll();
		return memberObj;
	}
	
	@GetMapping("/member/{emailid}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Member memberByEmail(@PathVariable("emailid") String emailid) {
		Member userObj = null;
			userObj = service.fetchUserByEmailId(emailid);
		return userObj;
	}
	@PutMapping("/member/{emailid}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Member updateMemberByEmail(@PathVariable("emailid") String emailid, @RequestBody Member member) {
		Member userObj = member;
			userObj = service.updateUserByEmailId(emailid);
		return userObj;
	}
	
}
