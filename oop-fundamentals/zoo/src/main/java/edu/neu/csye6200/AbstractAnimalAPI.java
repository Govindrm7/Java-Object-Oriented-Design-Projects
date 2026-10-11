package edu.neu.csye6200;

public abstract class AbstractAnimalAPI {
	public String name;
	
	public AbstractAnimalAPI(String name) {
		this.name=name;
	}
	public abstract void legs(String name);
	@Override
	public String toString() {
		return name;
	}

}
