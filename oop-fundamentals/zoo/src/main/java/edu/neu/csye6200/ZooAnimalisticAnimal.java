package edu.neu.csye6200;

import java.util.List;
import java.util.ArrayList;


class ZooAnimalisticAnimals {
	 private List<AnimalisticAPI>animals=new  ArrayList<>();
	 public void addAnimal(AnimalisticAPI animal) {
		 animals.add(animal);
	 }
	 public void tellAnimals() {
		 for(AnimalisticAPI animal:animals) {
			 animal.legs();
		 }
	 }

}
