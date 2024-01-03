package com.study.ch05;

import java.util.Scanner;

public class UserInfoMain {

    public static void main(String[] args) {
        // 사용자 정보 입력 받기 문제 //
        Scanner scanner = new Scanner(System.in);

        String name = null;
        int age = 0;
        String phone = null;
        int grade = 0;
        String address = null;

        System.out.print("이름: ");
        name = scanner.nextLine();

        System.out.print("나이: ");
        age = scanner.nextInt();

        System.out.print("연락처: ");
        scanner.nextLine();
        phone = scanner.nextLine();

        System.out.print("학년: ");
        grade = scanner.nextInt();

        System.out.print("주소: ");
        scanner.nextLine();
        address = scanner.nextLine();

        scanner.close();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("연락처: " + phone);
        System.out.println("학년: " + grade);
        System.out.println("주소: " + address);
    }

}
