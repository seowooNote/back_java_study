package com.study.ch09;

public class ElectronicDevice {
    boolean powerState;

    void setPowerOn() {
        powerState = true;
    }

    void setPowerOff() {
        powerState = false;
    }

    void showDeviceState() {
        System.out.println("전원 상태: " + ((powerState) ? "On" : "Off"));
    }

}

