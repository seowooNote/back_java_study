package com.study.ch02;

public class ConstantMain {

    public static void main(String[] args) {
        // 상수
        // 대문자로만 표기
        // 최초 한번만 대입이 가능
        // 무조건 초기화 되어야 함
        final String FILE_PATH = "c:/aws/project";
        // PATH = "d:/aws/project"; 불가능

        System.out.println(FILE_PATH);
    }

}
