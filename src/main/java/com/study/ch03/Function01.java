package com.study.ch03;

public class Function01 {

    public static void main(String[] args) {
        System.out.println(fx1(1, 2, 3, 2, 3)); // 함수 호출(콜)
        // System.out.println(fx2("홍길동")); 실행안됨 void
        fx2("홍길동");
        fx3();
    }

    // 함수 정의
    static int fx1(int a, int b, int c, int d, int e) {
        return a + b * c - d * e;
    }

    // void : 리턴값이 없는 함수 선언 -> System.out.println(); 못씀
    static void fx2(String name) {
        System.out.println("이름은: " + name + " 입니다.");
    }

    static void fx3() {
        System.out.println(1 + 2 * 3 - 2 * 3);
        System.out.println(1 + 2 * 3 - 2 * 3);
        System.out.println(1 + 2 * 3 - 2 * 3);
        System.out.println(1 + 2 * 3 - 2 * 3);
        System.out.println(1 + 2 * 3 - 2 * 3);
    }

}
