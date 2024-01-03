package com.study.ch06;

public class For02 {

    public static void main(String[] args) {
        // 문제1) 0, 1, 2, 3, 4 출력
        System.out.println("문제1");
        for(int i = 0; i < 5; i++) {
            if(i == 4) System.out.println(i);
            else System.out.print(i + ", ");
        }

        System.out.println("--------------");

        for(int i = 0; i < 5; i++) {
            System.out.print(i);
            if(i % 5 != 4) System.out.print(", ");
        }

        System.out.println();
        System.out.println("--------------");

        /* 문제2)
        * 0, 1, 2, 3, 4
        * 5, 6, 7, 8, 9
        */
        System.out.println("문제2");
        for(int i = 0; i < 10; i++) {
            if(i == 4 || i == 9) System.out.println(i);
            else System.out.print(i + ", ");
        }

        System.out.println("--------------");

        for(int i = 0; i < 10; i++) {
            System.out.print(i);
            if(i % 5 != 4) System.out.print(", ");
            if(i % 5 == 4) System.out.println();
        }

        System.out.println("--------------");

        /* 문제3)
        * 9, 8, 7, 6, 5
        * 4, 3, 2, 1, 0
        */
        System.out.println("문제3");
        for(int i = 10; i > 0; i--) {
            if(i == 6 || i == 1) System.out.println(i - 1);
            else System.out.print((i - 1) + ", ");
        }

        System.out.println("--------------");

        for(int i = 5; i > 0; i--) {
            System.out.print(i - 1);
            if((i - 1) % 5 != 0) System.out.print(", ");
        }

        System.out.println();
        System.out.println("--------------");

        for(int i = 10; i > 0; i--) {
            System.out.print(i - 1);
            if((i - 1) % 5 != 0) System.out.print(", ");
            if((i - 1) % 5 == 0) System.out.println();
        }

        System.out.println("--------------");
        // 가장 이상적인 for문(횟수를 직관적이게 그대로 놔둬야 함)
        int n = 10;
        for(int i = 0; i < n; i++) {
            int rv_i = n - 1 - i;
            System.out.print(rv_i);
            if(rv_i % 5 != 0) System.out.print(", ");
            if(rv_i % 5 == 0) System.out.println();
        }

//        System.out.println();
//        System.out.println("--------------");
//        System.out.println("고양이");
//
//        System.out.println("\\    /\\");
//        System.out.println(" )  ( ')");
//        System.out.println("(  /  )");
//        System.out.println(" \\(__)|");
//
//        System.out.println("--------------");
//        System.out.println("개");
//
//        System.out.println("|\\_/|");
//        System.out.println("|q p|   /}");
//        System.out.println("( 0 )\"\"\"\\");
//        System.out.println("|\"^\"`    |");
//        System.out.println("||_/=\\\\__|");
    }

}
