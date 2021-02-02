package com.cts.registration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //it will do auto generate the id
	private int id;
	private String emailId;
	private String userName;
	private String password;
	private String role;
	private String phoneNo;
	private String gender;
	private String guardianType;
	private String guardianName;
	private String address;
	private String citizenship;
	private String dob;
	private String regDate;
	private String accountType;
	private String branchName;
	

	public User(int id, String emailId, String userName, String password, String role, String phoneNo, String gender,
			String guardianType, String guardianName, String address, String citizenship, String dob, String regDate,
			String accountType, String branchName) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.phoneNo = phoneNo;
		this.gender = gender;
		this.guardianType = guardianType;
		this.guardianName = guardianName;
		this.address = address;
		this.citizenship = citizenship;
		this.dob = dob;
		this.regDate = regDate;
		this.accountType = accountType;
		this.branchName = branchName;
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


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public User() {
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
