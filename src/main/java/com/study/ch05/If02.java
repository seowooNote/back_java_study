package com.study.ch05;

import javax.print.attribute.standard.JobStateReasons;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class If02 {

    public static void main(String[] args) throws IOException {
        // Scanner 입력방식
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("x 값을 입력해주세요: ");
//        int x = scanner.nextInt();
//        System.out.print("y 값을 입력해주세요: ");
//        int y = scanner.nextInt();
//        scanner.close();

        // BufferedReader 입력방식
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("x 값을 입력해주세요: ");
//        int x = Integer.parseInt(bufferedReader.readLine());
//        System.out.print("y 값을 입력해주세요: ");
//        int y = Integer.parseInt(bufferedReader.readLine());
//        bufferedReader.close();

        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;

        System.out.print("x와 y를 입력해주세요(띄어쓰기로 구분): ");
        x = scanner.nextInt();
        y = scanner.nextInt();

//        if(x > 0 && y > 0) System.out.println("1사분면입니다.");
//        else if(x < 0 && y > 0) System.out.println("2사분면입니다.");
//        else if(x < 0 && y < 0) System.out.println("3사분면입니다.");
//        else if(x > 0 && y < 0) System.out.println("4사분면입니다.");
//        else System.out.println("오류");

        if(x == 0 || y == 0) {
            System.out.println("오류");
        } else if(x > 0 && y > 0) {
            System.out.println("1사분면입니다.");
        } else if(x < 0 && y > 0) {
            System.out.println("2사분면입니다.");
        } else if(x < 0 && y < 0) {
            System.out.println("3사분면입니다.");
        } else {
            System.out.println("4사분면입니다.");
        }

    }

}
