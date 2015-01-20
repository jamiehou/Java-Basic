package com.ioryz.statusmachine;

public class ACCoolStatus extends ACStatus {

    public ACCoolStatus(AirConditionStatusMachine statusMachine) {
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
    public void blast() {
        acsm.setStatus(acsm.BLAST);
    }
}
