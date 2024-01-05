package com.study.ch08;

import java.util.Scanner;

public class ArrayMain01 {
    public static void main(String[] args) {

        // 배열(Array)
        int[] numArray; // 선언

        numArray = new int[3]; // 값(주소) 대입(동적 메모리 할당)

        System.out.println(numArray);

        numArray[0] = 10;
        System.out.println(numArray[0]);
        numArray[1] = 20;
        System.out.println(numArray[1]);
        numArray[2] = 30;
        System.out.println(numArray[2]);

        Scanner scanner = new Scanner(System.in);
        System.out.print("index 입력 >> ");
        int index = scanner.nextInt();
        System.out.println(numArray[index]);

        for(int i = 0; i < numArray.length; i++) {
            System.out.println(i + "번째 인덱스 배열의 값: " + numArray[i]);
        }


    }
}
