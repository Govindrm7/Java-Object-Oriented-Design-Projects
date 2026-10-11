package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

class ZooObjectAnimals {
		    private List<Object> animals = new ArrayList<>();
		    
		    public void addAnimal(Object animal) {
		        animals.add(animal);
		    }
		    
		    public void tellAnimals() {
		        for (Object animal : animals) {
		            if (animal instanceof AnimalAPI) {
		                ((AnimalAPI) animal).legs();
		            } else if (animal instanceof AbstractAnimalAPI) {
		                ((AbstractAnimalAPI) animal).legs(((AbstractAnimalAPI) animal).name);
		            } else if (animal instanceof AnimalisticAPI) {
		                ((AnimalisticAPI) animal).legs();
		            }
		        }
		    }
		}

