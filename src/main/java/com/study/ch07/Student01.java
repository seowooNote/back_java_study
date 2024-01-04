package com.study.ch07;

public class Student01 {

    String name;
    int age;
//    String address;
    final String address;

    // 생성자 constructor
    // 매개변수 값 args(arguments)

    // NoArgsConstructo(기본 생성자)
//    Student01() {
//
//    }

    // AllArgsConstructor
    Student01(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // RequiredArgsConstructor
    Student01(String address) {
        this.address = address;
    }

}
