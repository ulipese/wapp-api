package com.wapp.Wapp.entities;

public class Local {
	private String city;
	private String country;
	
	
	public Local(String city, String country) {
		this.city = city;
		this.country = country;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String saveLocal() {
		return city + ", " + country;
	}
}
