package com.study.ch10;

public class ElectronicDeviceMain {

    public static void main(String[] args) {
        // 추상클래스는 즉시 생성할 수 없다. (=> 추상클래스를 상속한 일반클래스 or 익명클래스 를 사용하여 생성)
        // 익명클래스 : 이름이 없는 클래스
        ElectronicDevice electronicDevice = new ElectronicDevice() {
            @Override
            void showDeviceState() {
                System.out.println("첫번째 기기 상태확인");
            }
        }; // 추상클래스는 생성할 수 없다. 단, 형태만 완벽해진다면 생성할 수 있음 => 익명클래스(상속을 시키자마자 즉시 생성한 것 / 일회용 / 한번만 쓰고 말것)

        ElectronicDevice electronicDevice2 = new ElectronicDevice() {
            @Override
            void showDeviceState() {
                System.out.println("두번째 기기 상태확인");
            }
        };

        RemoteController remoteController = new RemoteController();
        remoteController.showDeviceState();
        ElectronicDevice[] electronicDevices = new ElectronicDevice[3];
        electronicDevices[0] = electronicDevice;
        electronicDevices[1] = electronicDevice2;
        electronicDevices[2] = remoteController;

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }

    }

}
