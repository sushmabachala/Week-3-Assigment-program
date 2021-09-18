package com.screen.cmd;

public class LaptopCmdOn implements Command {
    
	LaptopScreenCmd lapscreenOn;
	
	public LaptopCmdOn(LaptopScreenCmd lapscreenOn) {
		super();
		this.lapscreenOn = lapscreenOn;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		lapscreenOn.on();
	}
	
}
