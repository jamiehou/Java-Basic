package com.ioryz.statusmachine;

public class AirConditionStatusMachine {

    public final ACStatus OFF = new ACOffStatus(this);
    public final ACStatus BLAST = new ACBlastStatus(this);
    public final ACStatus COOL = new ACCoolStatus(this);
    public final ACStatus WARM = new ACWarmStatus(this);

    public ACStatus status;

    public AirConditionStatusMachine() {
        status = OFF;
    }

    public void printStatus() {
        System.out.println("***Current status is=>" + status.status());
    }

    public void setStatus(ACStatus status) {
        this.status = status;
    }
}
