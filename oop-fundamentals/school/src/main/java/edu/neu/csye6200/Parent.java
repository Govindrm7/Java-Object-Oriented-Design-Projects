package edu.neu.csye6200;

public class Parent {
	public Parent(String parentFirstName, String parentLastName) {
		this.parentFirstName = parentFirstName;
		this.parentLastName = parentLastName;
	}

	public String getLastName() {
		return parentLastName;
	}

	String parentFirstName;

	String parentLastName;

	@Override
	public String toString() {

		return parentFirstName + "-" + parentLastName;
	}

	public String getParentFirstName() {
		return parentFirstName;
	}

	public void setParentFirstName(String parentFirstName) {
		this.parentFirstName = parentFirstName;
	}

	public String getParentLastName() {
		return parentLastName;
	}

	public void setParentLastName(String parentLastName) {
		this.parentLastName = parentLastName;
	}

}
