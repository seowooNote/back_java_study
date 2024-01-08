package com.study.ch09;

public class ElectronicDeviceMain {

    public static void main(String[] args) {
        ElectronicDevice[] electronicDevices = new ElectronicDevice[10];

        for(int i = 0; i < electronicDevices.length; i++) {
            // 업캐스팅
            electronicDevices[i] = i % 2 == 0 ? new Computer() : new SmartPhone();
        }

        for(int i = 0; i < electronicDevices.length; i++) {
            // 업캐스팅을 하더라도 오버라이드(재정의) 된 메소드가 우선순위
            electronicDevices[i].showDeviceState();
        }

        System.out.println("--------------------");

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].setPowerOn();
        }

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }

        System.out.println("--------------------");

        for(int i = 0; i < electronicDevices.length; i++) {
            if(electronicDevices[i] instanceof Computer) {
                Computer computer = (Computer) electronicDevices[i];
                computer.playGame();
            } else if(electronicDevices[i] instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) electronicDevices[i];
                smartPhone.call();
            }

        }

    }

}
