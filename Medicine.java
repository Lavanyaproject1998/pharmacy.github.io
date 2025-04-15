package com.keane.training.domain;

public class Medicine {
	private int prodID;
	private String prodType;
	private String prodName;
	private double prodPrice;

	public Medicine(int prodID, String prodType, String prodName, double prodPrice) {
		super();
		this.prodID = prodID;
		this.prodType = prodType;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}

	public int getProdID() {
		return prodID;
	}

	public void setProdID(int prodID) {
		this.prodID = prodID;
	}

	public String getProdType() {
		return prodType;
	}

	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

	@Override
	public String toString() {
		// return "Medicine [prodID=" + prodID + ", prodType=" + prodType + ",
		// prodName=" + prodName + ", prodPrice="
		// + prodPrice + "]";

		StringBuilder builder = new StringBuilder();
		builder.append("Medicine [ProdID=");
		builder.append(prodID);
		builder.append(", ProdType=");
		builder.append(prodType);
		builder.append(", prodName=");
		builder.append(prodName);
		builder.append(", prodPrice=");
		builder.append(prodPrice);
		return builder.toString();
	}
}
