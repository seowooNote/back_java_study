package com.study.ch01;

// PrintStudy 파스칼 표기법
// printStudy 카멜 표기법
// class 명은 파스칼 표기법
public class PrintStudy {
    // public static void main(String[] args) {
    //
    // }
    // 단축키 방법1. main 입력 후 ctrl + space or tab 방법2. psvm 입력 후 ctrl + space or tab
    public static void main(String[] args) {
        // 연산
        System.out.println(2 + 4);

        // " " 문자열(큰따옴표 안쓰면 error) String
        System.out.println("2 + 4");

        // ' ' 문자(한글자만 됨) char
        System.out.println('가');

        //  System.out.println("\uAC00"); 유니코드 사용
        System.out.println("\uAC00");
        System.out.println("\u0061");

        // 문자의 경우 문자를 10진수로 변환하여 연산(+) 실행 후 출력
        System.out.println('홍' + '길' + '동');

        System.out.println("" + '홍' + '길' + '동');

        // 문자열은 문자들을 이어줌(+)
        System.out.println("홍" + "길" + "동");

        System.out.println(10 + 20); // 30
        System.out.println("" + 10 + 20); // 1020 -> ""문자열이 먼저 적용됨
        System.out.println("나이: " + (10 + 20));

        // char 자료형 -> 2byte
    }

}
