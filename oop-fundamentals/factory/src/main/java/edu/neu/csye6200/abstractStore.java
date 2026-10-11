package edu.neu.csye6200;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class abstractStore {
	public static List<Item> OutList =new ArrayList<>();
	public abstract List<Item> createItems() ;
		
	public void demo() 
	{
		List<Item> litems = createItems();
		
		
		Collections.sort(litems, Comparator.comparing(Item::getId));
		System.out.println("Sorted by ID:");
		litems.forEach(System.out::println);
		for (int i = 0; i < litems.size(); i++)
			OutList.add(litems.get(i));
		
		Collections.sort(litems, Comparator.comparing(Item::getName));
		System.out.println("Sorted by Name:");
		litems.forEach(System.out::println);
		for (int i = 0; i < litems.size(); i++)
			OutList.add(litems.get(i));
		
		Collections.sort(litems, Comparator.comparing(Item::getPrice));
		System.out.println("Sorted by Price:");
		litems.forEach(System.out::println);
		List<String> ls = new ArrayList<>();
		for (int i = 0; i < litems.size(); i++)
			OutList.add(litems.get(i));
		
		try {
			FileUtil.writestd();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
