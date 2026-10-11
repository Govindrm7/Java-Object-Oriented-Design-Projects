package edu.neu.csye6200;

public class Driver {

	public static void main(String[] args) {

		Cart cart =new Cart(20.0);
			
			Item item1 = new Item("Apple ", 5);
			
			Item item2 = new Item("wheat  ", 3);
			
			Item item3 = new Item("water", 1);
			
			// pass by reference
	        cart.checkout(cart,item1);
	        cart.checkout(cart,item2);
	        cart.checkout(cart,item3);
	        
	        
	        // pass by value
	        Cart.sillyCheckout(20, 5, 5, 15);
	        Cart.sillyCheckout(15, 3, 8, 12);
	        Cart.sillyCheckout(12, 1, 9, 11);


			
//	        System.out.println(cart.toString());

		}



}
