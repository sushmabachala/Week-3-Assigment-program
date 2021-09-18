package com.screen.cmd;

public class DesktopOnCmd implements Command {

	DesktopScreenCmd desktopOn;
	
	
	public DesktopOnCmd(DesktopScreenCmd desktopOn) {
		super();
		this.desktopOn = desktopOn;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		desktopOn.on();
	}

}
