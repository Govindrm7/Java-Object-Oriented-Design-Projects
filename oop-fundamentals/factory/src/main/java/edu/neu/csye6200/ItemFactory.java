package edu.neu.csye6200;

public interface ItemFactory <T extends Item> {
	T createItem(int id, String name, double price);

}
