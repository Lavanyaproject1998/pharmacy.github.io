package com.keane.training.domain;

public class Order extends Medicine {
	private int userID;
	private String userName;
	private int orderID;
	private String emailID;
	private String contactnuber;
	private String city;
	private int pinCode;
	private int quantity;

	public Order(int userID, String userName, int orderID, int prodID, String emailID, String contactnuber, String city,
			int pinCode, String prodType, String prodName, double prodPrice, int quantity) {
		super(prodID, prodType, prodName, prodPrice);
		this.userID = userID;
		this.userName = userName;
		this.orderID = orderID;
		this.emailID = emailID;
		this.contactnuber = contactnuber;
		this.city = city;
		this.pinCode = pinCode;
		this.quantity = quantity;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getContactnuber() {
		return contactnuber;
	}

	public void setContactnuber(String contactnuber) {
		this.contactnuber = contactnuber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order [userID=");
		builder.append(userID);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", orderID=");
		builder.append(orderID);
		builder.append(", prodID=");
		builder.append(super.getProdID());
		builder.append(", emailID=");
		builder.append(emailID);
		builder.append(", contactnuber=");
		builder.append(contactnuber);
		builder.append(", city=");
		builder.append(city);
		builder.append(", pinCode=");
		builder.append(pinCode);
		builder.append(", prodType=");
		builder.append(super.getProdType());
		builder.append(", prodPrice=");
		builder.append(super.getProdPrice());
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append("]");
		return builder.toString();
	}

}
