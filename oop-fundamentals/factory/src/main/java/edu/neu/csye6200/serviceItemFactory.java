package edu.neu.csye6200;

public class serviceItemFactory implements ItemFactory<ServiceItem>{
	private static final serviceItemFactory instance = new serviceItemFactory();

    private serviceItemFactory() {
    }

    public static serviceItemFactory getInstance() {
        return instance;
    }

	@Override
	public ServiceItem createItem(int id, String name, double price) {
		 return new ServiceItem(id, name, price);	}

}
