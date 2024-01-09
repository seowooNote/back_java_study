package com.study.ch10;

/*
* 인터페이스 (추상메소드, 상수 변수만 사용 가능)
*/
public interface Power {
    // 인터페이스는 무조건 상수만 가능(상수는 값을 바꿀 수 없다.)
    boolean powerState = false; // 상수 - final
    String ERROR_CODE = "-9999"; // 상수 - final
    // static final 생략되어 있음

    // 추상 메소드 정의
    void setPowerOn();
    void setPowerOff();

    // 일반 메소드를 정의 하는 방법 default 사용
    default void test() {

    }
}
