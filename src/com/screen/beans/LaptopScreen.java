package com.screen.beans;

public class LaptopScreen extends Screen {

	@Override
	protected void placeOrder() {
		// TODO Auto-generated method stub
       System.out.println("Order placed for laptop Screen");
	}

	@Override
	protected void payBill() {
		// TODO Auto-generated method stub
		  System.out.println("payment done for laptop Screen");
	}

	@Override
	protected void disPatchOrder() {
		// TODO Auto-generated method stub
			System.out.println("Deliver the laptop screen ");;
	}

}
