package com.study.ch04;

public class Operation06 {

    public static void main(String[] args) {

        /*
        * 조건연산자(삼항연산자)
        *
        * a > 0 ? "양수" : a == 0 ? "0" : "음수"
        */

        int iResult = 10 > 2 ? 1111 : 2222;
        System.out.println(iResult); // true -> 1111

        String sResult = 10 > 2 ? "1111" + 1 : "2222";
        System.out.println(sResult); // true -> 1111

        String name = null;
        System.out.println(name);

        String text1 = "sample";
        String text2 = text1;
        String text3 = new String("sample");
        String text4 = new String("sample");

        System.out.println(text1 == text2); //true
        System.out.println(text1.equals(text2)); //true
        System.out.println(text3 == text4); //false
        System.out.println(text3.equals("sample")); //true
        System.out.println(text3.equals("sample")); //true
        System.out.println("테스트 코드 작성");
    }

}
