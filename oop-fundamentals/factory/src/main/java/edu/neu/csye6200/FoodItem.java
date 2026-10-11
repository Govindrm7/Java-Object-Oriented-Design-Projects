package edu.neu.csye6200;

public  class FoodItem extends Item {

	public FoodItem(int id, String name, double price) {
		super(id, name, price);
	}

	@Override
	public String toString() {
		return "FoodItem"+super.toString();
	}

	

}