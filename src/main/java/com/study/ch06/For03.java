package com.study.ch06;

import java.util.Scanner;

public class For03 {

    public static void main(String[] args) {
        // 중첩 반복
        Scanner scanner = new Scanner(System.in);
        System.out.print("별 몇개?: ");
        int starCount = scanner.nextInt();

        for(int i = 0; i < starCount; i++){
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        *
        * *
        * **
        * ***
        *
        * ***
        * **
        * *
        *
        *
        *   *
        *  **
        * ***
        *
        * ***
        *  **
        *   *
        *
        *   *
        *  ***
        * *****
        */
    }

}
