package com.screen.beans;

public class DesktopScreenFactory extends ScreenAbstractFactory {

	@Override
	public Screen createScreen(String type) {
		// TODO Auto-generated method stub
		Screen screen = null;
		if(type.equals("Desktop")) {
			screen = new DesktopScreen();
		}
		return screen;
	}

}
