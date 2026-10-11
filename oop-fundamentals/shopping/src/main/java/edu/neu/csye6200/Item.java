package edu.neu.csye6200;

class Item {

	String Name;
	double price;
	
	public Item (String Name, double price){
		this.Name=Name;
		
		this.price=price;
	}

}
class Cart{
	private double myCash;
	private double myTotal;
	private double myChange;
	
	
	public Cart (double cash) {
		myCash=cash;
		myTotal=0;
		myChange=0;
		
	}
	public static void sillyCheckout(double cash, double  price, double total, double change) {
		double itemchange= cash-price;
		System.out.println("                    Receipt                    ");
	    System.out.println("-----------------------------------------------");
	    System.out.println("Items  | 		Cash |		 Change			   ");
	    System.out.println("-----------------------------------------------");
	    System.out.println("Total Price : $" + (price));
	    System.out.println("-----------------------------------------------");
	    System.out.println("Change		: $" + (itemchange));
	    System.out.println("-----------------------------------------------");
	    total =total+ price;
        change = change+itemchange;
        
	}
	static void demo() {
		Item item1 = new Item("Apple ", 5);
		
		Item item2 = new Item("wheat  ", 3);
		
		Item item3 = new Item("water", 1);
		
		Item[] items = {item1,item2, item3};
		 
	}
	public double checkout(Cart myCart, Item myItem) {
		double itemchange =myCash - myItem.price;
		myTotal=myTotal+myItem.price;
		return itemchange;
	}
	@Override
    public String toString() {
        return "Total:" + myTotal +", Change:" + myChange;
    }
}


