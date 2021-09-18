package com.screen.cmd;

public class DesktopCmdOff implements Command{

	DesktopScreenCmd desktopOff;
	
	public DesktopCmdOff(DesktopScreenCmd desktopOff) {
		super();
		this.desktopOff = desktopOff;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		desktopOff.off();
	}

}
