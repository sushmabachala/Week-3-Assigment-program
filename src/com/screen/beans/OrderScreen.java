package com.screen.beans;

import com.screen.cmd.DesktopCmdOff;
import com.screen.cmd.DesktopOnCmd;
import com.screen.cmd.DesktopScreenCmd;
import com.screen.cmd.LaptopCmdOff;
import com.screen.cmd.LaptopCmdOn;
import com.screen.cmd.LaptopScreenCmd;
import com.screen.cmd.RemoteControl;

public class OrderScreen {
	
	
	public static void main(String[] args) {
		
		ScreenAbstractFactory desktop = new DesktopScreenFactory();
		ScreenAbstractFactory laptop = new LaptopScreenFactory();
		
		Screen orderDesktopScreen = desktop.orderScreen("Desktop");
		System.out.println();
		Screen orderLaptopScreen = laptop.orderScreen("Laptop");
		System.out.println();
		//Command pattern to switch on/off the 
		System.out.println("*******command pattern to switch off/on screens*********");
		
		RemoteControl control = new RemoteControl();
		DesktopScreenCmd desk = new DesktopScreenCmd();
		LaptopScreenCmd lap = new LaptopScreenCmd();
		
		control.setCommand(new DesktopCmdOff(desk));
		control.pressButton();
		
		control.setCommand(new DesktopOnCmd(desk));
		control.pressButton();
		
		control.setCommand(new LaptopCmdOff(lap));
		control.pressButton();
		
		control.setCommand(new LaptopCmdOn(lap));
		control.pressButton();
		
	}

}
