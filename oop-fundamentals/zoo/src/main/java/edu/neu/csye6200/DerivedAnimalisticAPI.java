package edu.neu.csye6200;

	class Cat implements AnimalisticAPI{
		private String name;
		public Cat(String name) {
			this.name=name;
			
		}
		@Override
		public void legs() {
			System.out.println(name+"has 4 legs");
		}
		
	}
	class Dog implements AnimalisticAPI{
		private String name;
		
		public Dog(String name) {
			this.name=name;
		}
		@Override
		public void legs() {
			System.out.println(name+"has 4 legs");
		}
	}


