package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

class ZooAnimals {
	 private List<AnimalAPI>animals=new ArrayList<>();
	 public void addAnimal(AnimalAPI animal) {
		 animals.add(animal);
	 }
	 public void tellAnimals() {
		 for(AnimalAPI animal:animals) {
			 animal.legs();
		 }
	 }
	

}
