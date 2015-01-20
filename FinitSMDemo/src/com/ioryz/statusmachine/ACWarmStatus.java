package com.ioryz.statusmachine;

public class ACWarmStatus extends ACStatus {

    public ACWarmStatus(AirConditionStatusMachine statusMachine) {
        super(statusMachine);
    }

    @Override
    public void power() {
        acsm.setStatus(acsm.OFF);
    }

    @Override
    public void cool() {
        acsm.setStatus(acsm.COOL);
    }

    @Override
    public void blast() {
        acsm.setStatus(acsm.BLAST);
    }
}
