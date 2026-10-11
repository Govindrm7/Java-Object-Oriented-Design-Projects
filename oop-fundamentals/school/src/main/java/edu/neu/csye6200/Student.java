package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student extends Person {
	private Parent parent;

	public Student(int id, String firstName, String lastName, int age, double gpa) {
		super(id, firstName, lastName, age, gpa);


	}

	public int getId() {
		return super.getId();
	}

	public int getAge() {
		return super.getAge();
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public Parent getParent() {
		return parent;
	}
	@Override
	public String toString() {
		return super.toString() +" "+ this.getGpa()+" " + this.getParent().toString();
	}



}
