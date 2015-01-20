package com.ioryz.statusmachine;

public class ACBlastStatus extends ACStatus {

    public ACBlastStatus(AirConditionStatusMachine statusMachine) {
        super(statusMachine);
    }

    @Override
    public void power() {
        acsm.setStatus(acsm.OFF);
    }

    @Override
    public void warm() {
        acsm.setStatus(acsm.WARM);
    }

    @Override
    public void cool() {
        acsm.setStatus(acsm.COOL);
    }
}
