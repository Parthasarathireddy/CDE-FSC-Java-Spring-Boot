package com.cts.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.registration.model.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {


	public Member findByEmailId(String email);

}
