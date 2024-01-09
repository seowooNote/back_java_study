package com.study.ch10;

/*
* [추상화]
* : 공통점을 뽑아낸다.
* 1. 추상 클래스 abstract class
* 2. 인터페이스 interface
*/
public abstract class ElectronicDevice {
    boolean powerState;

    void setPowerOn() {
        powerState = true;
    }

    void setPowerOff() {
        powerState = false;
    }

    // 추상 메소드
    // 추상클래스와 인터페이스에만 사용 가능
    // 선언만 하고, 구체적인 기능에 관련된 코드는 작성하지 않는다
    // 사용시 상속하는 일반 클래스에 해당 메소드를 재정의 해서 구현시켜야 함(반드시)
    abstract void showDeviceState();
}
