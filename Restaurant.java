//Created by Michael Garvin 4-6-2021 for Lettuce Eat

package main;

import java.util.ArrayList;

public class Restaurant {
	private String name;
	private Rating rating;
	private boolean GF; //gleuten-free
	private boolean Vegan;
	private boolean Vegetarian;
	private ArrayList<String> reviews;
	private Address address;

	public Restaurant(String name, Address address) {
		this.name = name;
		this.address = address;
		this.rating = new Rating();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean getGF() {
		return GF;
	}
	
	public void setGF(boolean GF) {
		this.GF = GF;
	}
	
	public boolean getVegan() {
		return Vegan;
	}
	
	public void setVegan(boolean Vegan) {
		this.Vegan = Vegan;
	}
	
	public boolean getVegetarian() {
		return Vegetarian;
	}
	
	public void setVegertarian(boolean Vegetarian) {
		this.Vegetarian = Vegetarian;
	}
	
	public ArrayList<String> getReviews(){
		return reviews;
	}
	
	public Address getAddress() {
		return Address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void addReview(String review) {
		reviews.add(review);
	}
}
