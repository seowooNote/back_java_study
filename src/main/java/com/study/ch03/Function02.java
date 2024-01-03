package com.study.ch03;

public class Function02 {

    // 매개변수 X, 리턴 X
    public static void fx01() {
        // void -> 비어있는, 공허한
        System.out.println("fx01 함수 실행");
        System.out.println();
    }

    // 오버로딩 : 함수명이 같더라도 매개변수의 자료형이 다르면 함수정의가 가능
    // 매개변수 O, 리턴 X
    public static void fx02(int age, String name) {
        System.out.println("fx02 함수 실행");
        System.out.println("나이: " +  age);
        System.out.println("이름: " + name);
        System.out.println();
    }

    // 매개변수 O, 리턴 X
    public static void fx02(String name, int age) {
        System.out.println("fx02 함수 실행");
        System.out.println("이름: " + name);
        System.out.println("나이: " +  age);
        System.out.println();
    }

    // 매개변수 X, 리턴 O(int 자료형)
    public static int fx03() {
        System.out.println("fx03 함수 실행");
        return 100;
    }

    // 매개변수 O, 리턴 O(String 자료형)
    public static String fx04(String name, int age) {
        System.out.println("fx04 함수 실행");
        return name + ", " + age;
    }

    public static void main(String[] args) {
        fx01(); // 함수 호출
        
        // 오버로딩
        fx02(20, "홍길동");
        fx02("홍길동2", 22);
        
        int num = fx03();
        System.out.println(num);
        System.out.println(fx03());

        System.out.println();

        String result = fx04("홍길동3", 33);
        System.out.println(result);
    }

}
