package com.edu.abhi.designpatterns.decorator.coffee;

public class PlainCoffee implements Coffee{

	
	public PlainCoffee(){
	}
	
	@Override
	public String getDescription() {
		return "Plain Black";
	}

	@Override
	public double getCost() {
		return 1.50;
	}

	
}
