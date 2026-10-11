package edu.neu.csye6200;

import java.util.Comparator;

public class OrderById implements Comparator<Person> {

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return Integer.compare(o1.getId(), o2.getId());
		}

	}