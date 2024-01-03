package com.study.ch06;

import java.util.Scanner;

public class For03 {

    public static void main(String[] args) {
        // 중첩 반복
        Scanner scanner = new Scanner(System.in);
        System.out.print("별 몇개?: ");
        int starCount = scanner.nextInt();

        /*
        * *
        * **
        * ***
        */

        for(int i = 0; i < starCount; i++){
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        * ***
        * **
        * *
        */

        for(int i = 0; i < starCount; i++) {
            for(int j = 0; j < starCount - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        *    *
        *   **
        *  ***
        */

        for(int i = 0; i < starCount; i++) {
            for(int j = starCount - i; j > 1; j--) {
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        * ***
        *  **
        *   *
        */

        System.out.println("--");

        for(int i = 1; i <= starCount; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = starCount; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }

        /*
        *   *
        *  ***
        * *****
        */

        for(int i = 0; i < starCount; i++) {
            for(int j = 0; j < starCount - i + 1 ; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i * 2 - 1; k++) {
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
