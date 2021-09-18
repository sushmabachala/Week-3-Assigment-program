package com.screen.beans;

public class DesktopScreen extends Screen {


	@Override
	protected void placeOrder() {
		// TODO Auto-generated method stub
       System.out.println("Order placed for Desktop Screen");
	}

	@Override
	protected void payBill() {
		// TODO Auto-generated method stub
		  System.out.println("payment done for Desktop Screen");
	}

	@Override
	protected void disPatchOrder() {
		// TODO Auto-generated method stub
			System.out.println("Deliver the Desktop screen ");;
	}


}
