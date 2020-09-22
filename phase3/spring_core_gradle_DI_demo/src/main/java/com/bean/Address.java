package com.bean;

public class Address {

	private int aid;
	private String city;
	private int zip;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", zip=" + zip + "]";
	}

//	public Address(int aid, String city, int zip) {
//		super();
//		this.aid = aid;
//		this.city = city;
//		this.zip = zip;
//	}
	
	
}
