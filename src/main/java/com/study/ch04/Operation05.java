package com.study.ch04;

import java.util.Scanner;

public class Operation05 {

    public static void main(String[] args) {

        // 사분면 문제
        int x = 3;
        int y = 5;

        String result = x > 0 && y > 0 ? "1사분면" :
                        x < 0 && y > 0 ? "2사분면" :
                        x < 0 && y < 0 ? "3사분면" :
                        x > 0 && y < 0 ? "4사분면" : "오류";
        System.out.println("결과 => " + result);

        String result2 = x == 0 || y == 0 ? "오류"
                         : (x > 0 ? (y > 0 ? "1사분면" : "4사분면")
                         : (y > 0 ? "2사분면" : "3사분면"));
        System.out.println("결과 => " + result2);

        // x == 0 || y == 0 ? "오류" :
        
    }

}
