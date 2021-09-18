package com.screen.beans;

public class LaptopScreenFactory extends ScreenAbstractFactory {

	@Override
	public Screen createScreen(String type) {
		// TODO Auto-generated method stub
		Screen screen = null;
		if(type.equals("Laptop")) {
			screen = new LaptopScreen();
		}
		return screen;
	}

}
