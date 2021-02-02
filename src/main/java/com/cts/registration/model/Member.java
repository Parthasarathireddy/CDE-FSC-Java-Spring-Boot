package com.cts.registration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String emailId;
	private String patientName;
	private String meritalStatus;
	private String phoneNo;
	private String gender;
	private String guardianType;
	private String state;
	private String city;
	private String guardianName;
	private String address;
	private String citizenship;
	private String dob;
	private String regDate;
	private String accountType;
	private String branchName;
	private String submittedUser;
	private String status;
	
	public Member() {
	}
	
	public Member(int id, String emailId, String patientName, String meritalStatus, String phoneNo, String gender,
			String guardianType, String state, String city, String guardianName, String address, String citizenship,
			String dob, String regDate, String accountType, String branchName, String submittedUser, String status) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.patientName = patientName;
		this.meritalStatus = meritalStatus;
		this.phoneNo = phoneNo;
		this.gender = gender;
		this.guardianType = guardianType;
		this.state = state;
		this.city = city;
		this.guardianName = guardianName;
		this.address = address;
		this.citizenship = citizenship;
		this.dob = dob;
		this.regDate = regDate;
		this.accountType = accountType;
		this.branchName = branchName;
		this.submittedUser = submittedUser;
		this.status = status;
	}



	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGuardianType() {
		return guardianType;
	}

	public void setGuardianType(String guardianType) {
		this.guardianType = guardianType;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getMeritalStatus() {
		return meritalStatus;
	}
	public void setMeritalStatus(String meritalStatus) {
		this.meritalStatus = meritalStatus;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getSubmittedUser() {
		return submittedUser;
	}

	public void setSubmittedUser(String submittedUser) {
		this.submittedUser = submittedUser;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
