package edu.neu.csye6200;
public class DerivedAbstractAPI{
	
}

	class Zebra extends AbstractAnimalAPI{
		public Zebra(String name) {
			super(name);
		}
		
		@Override
		public void legs(String name) {
			System.out.println(name+"has 4 legs");			
		}
	}
	class Kangaroo extends AbstractAnimalAPI{
		public Kangaroo(String name) {
			super(name);
		}
	@Override
	public void legs(String name) {
		System.out.println(name+"has 2 legs");
	}

}
