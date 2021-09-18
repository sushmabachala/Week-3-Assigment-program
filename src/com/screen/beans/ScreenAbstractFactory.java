package com.screen.beans;

public abstract class ScreenAbstractFactory {

	public abstract Screen createScreen(String type);
	
	public Screen orderScreen(String type) {
		Screen screen = createScreen(type);
		screen.placeOrder();
		screen.payBill();
		screen.disPatchOrder();
		return screen;
	}
	
	
}
