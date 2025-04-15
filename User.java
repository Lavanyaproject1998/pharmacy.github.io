package com.keane.training.domain;

public class User {

	private int user_ID;
	private String user_Name;
	private String passWord;
	private String email_ID;
	private int age;
	private String contactNumber;
	private String city;
	private String state;
	private int pinCode;
	
	public User() {
		super();
	}

	public User(int user_ID, String user_Name, String passWord, String email_ID, int age, String contactNumber,
			String city, String state, int pinCode) {
		super();
		this.user_ID = user_ID;
		this.user_Name = user_Name;
		this.passWord = passWord;
		this.email_ID = email_ID;
		this.age = age;
		this.contactNumber = contactNumber;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	public int getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getEmail_ID() {
		return email_ID;
	}

	public void setEmail_ID(String email_ID) {
		this.email_ID = email_ID;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [User ID=");
		builder.append(user_ID);
		builder.append(", Name=");
		builder.append(user_Name);
		builder.append(", PassWord=");
		builder.append(passWord);
		builder.append(", Email ID=");
		builder.append(email_ID);
		builder.append(", Age=");
		builder.append(age);
		builder.append(",Contact Number=");
		builder.append(contactNumber);
		builder.append(", City=");
		builder.append(city);
		builder.append(", State=");
		builder.append(state);
		builder.append(", Pincode=");
		builder.append(pinCode);
		builder.append("]");
		return builder.toString();
	}

}
