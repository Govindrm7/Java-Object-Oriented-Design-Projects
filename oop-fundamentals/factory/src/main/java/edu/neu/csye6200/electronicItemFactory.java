package edu.neu.csye6200;

public class electronicItemFactory implements ItemFactory<ElectronicItem> {
	private static electronicItemFactory instance;

	private electronicItemFactory() {
    }

	public static electronicItemFactory getInstance() {
		if (instance == null) {
			instance = new electronicItemFactory();
		}
		return instance;
	}

	@Override
	public ElectronicItem createItem(int id, String name, double price) {
		// TODO Auto-generated method stub
		return new ElectronicItem(id, name, price);
	}
}
