package edu.neu.csye6200;

public class AnimalAPI {
	private String name;
	int legs;
	
	
	public AnimalAPI(String name, int legs) {
		this.name=name;
		this.legs=legs;
	}
	public void legs() {
		System.out.println(name+"has number of legs "+this.legs);
	}
	@Override
	public String toString() {
		return name;
	}
	

}
