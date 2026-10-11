package edu.neu.csye6200;

public class foodItemFactory implements ItemFactory<FoodItem>{

	@Override
	public FoodItem createItem(int id, String name, double price) {
		// TODO Auto-generated method stub
		return new FoodItem(id, name, price);
	}
}
