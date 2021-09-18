package com.screen.cmd;

public class LaptopCmdOff implements Command {
     
	LaptopScreenCmd lapScreenCmd;
	
	
	public LaptopCmdOff(LaptopScreenCmd lapScreenCmd) {
		super();
		this.lapScreenCmd = lapScreenCmd;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		lapScreenCmd.off();
	}

	
	
}
