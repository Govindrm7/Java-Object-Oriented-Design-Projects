package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

class ZooAbstractAnimals {
	 private List<AbstractAnimalAPI>animals=new ArrayList<>();
	 public void addAnimal(AbstractAnimalAPI animal) {
		 animals.add(animal);
	 }
	 public void tellAnimals() {
		 for(AbstractAnimalAPI animal:animals) {
			 animal.legs(animal.name);
		 }
	 }
	 

}
