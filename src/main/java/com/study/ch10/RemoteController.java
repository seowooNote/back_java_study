package com.study.ch10;

// 다중 상속 불가
public class RemoteController extends ElectronicDevice {
    @Override
    void showDeviceState() {
        System.out.println("리모컨의 상태를 확인합니다.");
    }
}
