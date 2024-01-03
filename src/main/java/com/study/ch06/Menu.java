package com.study.ch06;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        // while문 적용 예시(조건중심) <-> for문(반복횟수 중심)
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

//        while(true) {
//            System.out.print("입력: ");
//            int inputValue = scanner.nextInt();
//
//            System.out.println("입력한 번호: " + inputValue);
//
//            if(inputValue == 0) {
//                System.out.println("이번까지만 실행하고 반복을 멈춥니다.");
//                break;
//            }
//
//            System.out.println("반복문 마지막에 출력");
//        }
//
//        System.out.println("----------------------------");
//
//        while(flag) {
//            System.out.print("입력: ");
//            int inputValue = scanner.nextInt();
//
//            System.out.println("입력한 번호: " + inputValue);
//
//            if(inputValue == 0) {
//                flag = false;
//            }
//
//            System.out.println("반복문 마지막에 출력"); // 위의 경우 boolean flag = true; 를 이용해서 while 문의 조건문 부분을 flag를 사용
//        }

        System.out.println("----------------------------");

        // console 프로그램 원리(ex. intelliJ, excel, PPT, console 게임...)
        while(flag) {
            System.out.print("입력: ");
            int inputValue = scanner.nextInt();

            System.out.println("입력한 번호: " + inputValue);

            if(inputValue == 0) {
                System.out.println("프로그램을 종료합니다.");
                flag = false;
            } else if(inputValue == 1) {
                System.out.println("1번으로 들어왔습니다.");
                boolean flag2 = true;
                while(flag2) {
                    System.out.print("1번에서 입력: ");
                    inputValue = scanner.nextInt();

                    System.out.println("입력한 번호: " + inputValue);
                    if(inputValue == 0) {
                        System.out.println("프로그램을 종료합니다.");
                        flag = false;
                        flag2 = false;
                    } else if(inputValue == -1) {
                        System.out.println("뒤로가기");
                        flag2 = false;
                    } else if(inputValue == 1) {
                        System.out.println("1번에서 1번으로 들어왔습니다.");
                    } else if(inputValue == 2) {
                        System.out.println("1번에서 2번으로 들어왔습니다.");
                    } else {
                        System.out.println("다시입력하세요.");
                    }
                    System.out.println();
                }
            } else if(inputValue == 2) {
                System.out.println("2번으로 들어왔습니다.");
            } else {
                System.out.println("다시입력하세요.");
            }
            System.out.println();
        }

        scanner.close();
    }

}
