package edu.neu.csye6200;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class store extends abstractStore 
{
	public final ItemFactory<FoodItem> foodItems = new foodItemFactory();
	public final ItemFactory<ElectronicItem> electronicItems = electronicItemFactory.getInstance();
	public final ItemFactory<ServiceItem> serviceItems=serviceItemFactory.getInstance();

	@Override
	public List<Item> createItems()
	{
		System.out.println("Called: CreateItems");
		List<Item> goods = new ArrayList<>();
		List<String> foodList =FileUtil.reader("src/main/java/edu/neu/csye6200/FoodItemCSV");
		List<String> eItemList = FileUtil.reader("src/main/java/edu/neu/csye6200/ElectronicItemCSV");
		List<String> sItemList = FileUtil.reader("src/main/java/edu/neu/csye6200/ServiceItemCSV");
		
		for(String line : foodList) {
			String[]parts=line.split(",");
			int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            double price = Double.parseDouble(parts[2]);
            goods.add(foodItems.createItem(id, name, price));
		}
		for(String line : eItemList) {
			String[]parts=line.split(",");
			int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            double price = Double.parseDouble(parts[2]);
            goods.add(electronicItems.createItem(id, name, price));
		}
		for(String line : sItemList) {
			String[]parts=line.split(",");
			int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            double price = Double.parseDouble(parts[2]);
            goods.add(serviceItems.createItem(id, name, price));
		}


		return goods;
	}
	
	

	
}