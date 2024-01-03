package com.study.ch05;

import javax.sound.midi.SoundbankResource;

public class If01 {

    public static void main(String[] args) {

        // 조건문

        int i = 9;

//        if(i > 3) {
//            System.out.println("i가 3보다 큽니다.");
//            System.out.println("if문 종료.");
//        } else if(i == 3) {
//            System.out.println("i는 3입니다.");
//            System.out.println("if문 종료.");
//        } else {
//            System.out.println("i가 3보다 크지 않습니다.");
//            System.out.println("if문 종료.");
//        }

        if(i > 3) {
            System.out.println("i가 3보다 큽니다.");
            System.out.println("if문 종료.");
        } else if(i == 3) {
            System.out.println("i는 3입니다.");
        } else {
            System.out.println("i가 3보다 작습니다.");
        }


        System.out.println("-----------------------------");

        String tempStr = i > 3 ? print("i가 3보다 큽니다.") : "";

    }

    public static String print(String str) {
        System.out.println(str);
        return str;
    }

}
