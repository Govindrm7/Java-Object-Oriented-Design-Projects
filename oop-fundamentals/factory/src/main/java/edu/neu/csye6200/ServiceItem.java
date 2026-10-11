package edu.neu.csye6200;

public class ServiceItem extends Item {
	public ServiceItem(int id, String name, double price) {

		super(id, name, price);
	}

	@Override
	public String toString() {
		return "ServiceItem" + super.toString();
	}
}
