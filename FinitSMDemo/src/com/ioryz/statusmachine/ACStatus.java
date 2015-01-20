package com.ioryz.statusmachine;

public abstract class ACStatus {

	protected AirConditionStatusMachine acsm;

	public ACStatus(AirConditionStatusMachine statusMachine) {
		this .acsm = statusMachine;
	}

	public String status() {
		String s = getClass().getName();
        return s.substring(s.lastIndexOf('.') + 1);
	}

	public abstract void power();

	public void blast() {}

	public void cool() {}

	public void warm() {}
}