package com.soumya.splitwise;

// Defines the characteristics of a user
public class User {
	
	private String name,uid,email,mobNo;

	public User(String uid, String name, String email, String mobNo) {
		super();
		this.name = name;
		this.uid = uid;
		this.email = email;
		this.mobNo = mobNo;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
