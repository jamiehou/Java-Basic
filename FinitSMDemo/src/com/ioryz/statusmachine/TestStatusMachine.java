package com.ioryz.statusmachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestStatusMachine {

    public static void main(String[] args) {
        AirConditionStatusMachine acsm = new AirConditionStatusMachine();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cmd = "";
        System.out.println("AirCondition Status Machine is ready, please enter commands to change status: 0-Power command; 1-Blast Mode; 2-Cool Mode; 3-Warm Mode");
        try {
            cmd = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (cmd != null && !cmd.equals("quit")) {
            if ("0".equals(cmd)) {
                acsm.status.power();
            } else if ("1".equals(cmd)) {
                acsm.status.blast();
            } else if ("2".equals(cmd)) {
                acsm.status.cool();
            } else if ("3".equals(cmd)) {
                acsm.status.warm();
            } else {
                System.out.println("***[Error]Wrong input command, please enter again!***");
            }
            acsm.printStatus();
            try {
                cmd = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
