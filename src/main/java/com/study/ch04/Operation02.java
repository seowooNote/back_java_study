package com.study.ch04;

public class Operation02 {

    public static void main(String[] args) {
        /*
        * << 연산자 >>
        *
        * 산술연산자, 비교연산자, 논리연산자, 조건연산자, 복합대입연산자
        */

        // boolean 자료형
        System.out.println(true);
        System.out.println(false);
        System.out.println("---------------------");

        boolean flag = true;
        System.out.println(flag);
        boolean flag2 = 10 > 2;
        System.out.println(flag2);
        System.out.println("---------------------");

        System.out.println("비교연산자");
        System.out.println(" > " + flag2);
        System.out.println(" < " + (10 < 2));
        System.out.println(" >= " + (10 >= 2)); // >= : 이상
        System.out.println(" <= " + (10 <= 2)); // <= : 이하
        System.out.println(" == " + (10 == 2)); // == : 서로 같은지?
        System.out.println(" != " + (10 != 2)); // == : 서로 같지 않은지?
        System.out.println("---------------------");

    }

}
