package com.ioryz.statusmachine;

public class ACOffStatus extends ACStatus {

    public ACOffStatus(AirConditionStatusMachine statusMachine) {
        super(statusMachine);
    }

    @Override
    public void power() {
        acsm.setStatus(acsm.BLAST);
    }
}
