package edu.neu.csye6200;

import java.util.Comparator;

public class OrderByGpa implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getGpa(), o2.getGpa());
	}

}
