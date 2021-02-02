package com.cts.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.registration.model.Member;
import com.cts.registration.repository.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository repo;
	
public Member saveMember(Member member) {
		
		return repo.save(member);
		
	}
	
	public Member fetchUserByEmailId(String email) {
		return repo.findByEmailId(email);
	}
	
	public List <Member> findAll() {
		return repo.findAll();
	}
	
	public Member updateUserByEmailId(String email) {
		Member memberFromDb = repo.findByEmailId(email);
		return repo.save(memberFromDb);
	}

}
