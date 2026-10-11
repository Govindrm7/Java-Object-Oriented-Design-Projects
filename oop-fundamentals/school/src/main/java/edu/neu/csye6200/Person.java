package edu.neu.csye6200;

public class Person {
	private int id;

	private String firstName;

	private String lastName;

	private int age;

	private double gpa;

	public Person(int id, String firstName, String lastName, int age, double gpa) {
		this.id = id;

		this.firstName = firstName;

		this.lastName = lastName;

		this.age = age;
		this.gpa=gpa;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGpa() {
		return this.gpa;
	}

	@Override
	public String toString() {
		return id + " - " + firstName + " - " + lastName + " - " + age;
	}

	public String toString1() {
		// TODO Auto-generated method stub
		return null;
	}

}
