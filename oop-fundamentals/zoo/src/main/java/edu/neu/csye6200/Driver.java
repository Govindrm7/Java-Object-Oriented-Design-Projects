package edu.neu.csye6200;


		public class Driver {
		    public static void main(String[] args) {
		        Leopard cheetah = new Leopard("Cheetah1");
		        Panda panda = new Panda("Hathi");
		        
		        Zebra zebra = new Zebra("max");
		        Kangaroo kangaroo = new Kangaroo("kangu");
		        
		        Dog dog = new Dog("shadow");
		        Cat cat = new Cat("kitu");
		        
		        ZooAnimals zooAnimals = new ZooAnimals();
		        zooAnimals.addAnimal(cheetah);
		        zooAnimals.addAnimal(panda);
		        
		        ZooAbstractAnimals zooAbstractAnimals = new ZooAbstractAnimals();
		        zooAbstractAnimals.addAnimal(zebra);
		        zooAbstractAnimals.addAnimal(kangaroo);
		        
		        ZooAnimalisticAnimals zooAnimalisticAnimals = new ZooAnimalisticAnimals();
		        zooAnimalisticAnimals.addAnimal(dog);
		        zooAnimalisticAnimals.addAnimal(cat);
		        
		        ZooObjectAnimals zooObjectAnimals = new ZooObjectAnimals();
		        zooObjectAnimals.addAnimal(cheetah);
		        zooObjectAnimals.addAnimal(zebra);
		        zooObjectAnimals.addAnimal(dog);
		        
		        System.out.println("Zoo Animals (Concrete API):");
		        zooAnimals.tellAnimals();
		        
		        System.out.println("Zoo Abstract Animals (Abstract API):");
		        zooAbstractAnimals.tellAnimals();
		        
		        System.out.println("Zoo Animalistic Animals (Interface API):");
		        zooAnimalisticAnimals.tellAnimals();
		        
		        System.out.println("Zoo Object Animals (Object API):");
		        zooObjectAnimals.tellAnimals();
		    }
		}

