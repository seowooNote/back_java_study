package com.study.ch14;

import java.util.Objects;
import java.util.Scanner;

/*
* Object 클래스
*/
// public class ObjectTest (extends Object) { ... }
public class ObjectTest {
    private String name;
    private String address;

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // ObjectTest 클래스는 Object 클래스를 상속 받기 때문에 재정의(오버라이드)가 가능
    // => 모든 클래스는 Object 클래스를 상속받고 있음(Object 클래스만 다중상속이 가능)
    // 상속관계에서 메소드는 재정의(오버라이드)된 메소드가 우선순위
    @Override
    public String toString() {
        return "toString 메소드 테스트";
    }

    // 상속관계에서 메소드는 재정의(오버라이드)된 메소드가 우선순위
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectTest that = (ObjectTest) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    // 상속관계에서 메소드는 재정의(오버라이드)된 메소드가 우선순위
    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}
