package com.study.ch04;

public class Operation04 {

    public static void main(String[] args) {
        // 윤년문제
        int year1 = 2000;
        int year2 = 1999;
        System.out.println("결과 " + (((year1 % 4 == 0 && year1 % 100 != 0) || year1 % 400 ==0) && (year1 > 0 && year1 < 4001)));
        System.out.println("결과 " + (((year2 % 4 == 0 && year2 % 100 != 0) || year2 % 400 ==0) && (year2 > 0 && year2 < 4001)));

        int year = 2000;
        boolean step1 = year > 0;
        boolean step2 = year < 4001;
        boolean step3 = year % 4 == 0;
        boolean step4 = year % 100 != 0;
        boolean step5 = year % 400 ==0;

        boolean result = step1 && step2 && ((step3 && step4) || step5);
        System.out.println("결과 => " + result); // true
    }

}
