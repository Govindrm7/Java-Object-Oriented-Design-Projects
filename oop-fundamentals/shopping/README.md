#Shopping Java Object Oriented Design Project
# Item and Cart Classes

The Item and Cart classes are designed to facilitate a shopping experience with a single $20 bill. The Item class is responsible for creating shopping items and the Cart class manages the shopping process, including payment and change calculation.

## Item Class
- The Item class is used to create objects for shopping items.
- It is equipped with a static demo method to demonstrate the shopping process.

## Cart Class
The Cart class includes the following data members:
- `private int myCash`
- `private int myTotal`
- `private int myChange`

It also provides the following methods:
1. `public void sillyCheckout(double cash, double price, double total, double change);`
   - This method demonstrates pass by value and is used to attempt to calculate change for each item.
   - Parameters:
     - `cash`: money tendered to the cashier for the total purchase of all items
     - `price`: purchase price of the current item
     - `total`: running total of all items purchased
     - `change`: change after the purchase of all items

2. `public double Checkout(Cart myCart, Item myItem);`
   - This method demonstrates pass by reference and is used to accumulate the total and calculate change for each item.
   - Parameters:
     - `myCart`: shopping cart with accumulating totals
     - `myItem`: Item object to checkout
   - Returns: change due to the customer after payment

3. `public String toString();`
   - This method returns a String representation of the Cart object state.

The classes are designed to provide a seamless shopping experience and demonstrate the concepts of pass by value and pass by reference.
