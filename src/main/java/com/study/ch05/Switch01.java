package com.study.ch05;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {
        // switch 문
        Scanner scanner = new Scanner(System.in);
        String num = null;
        System.out.print("숫자를 입력해주세요: ");
        num = scanner.nextLine();

        switch (num) {
            case "0":
                System.out.println("0 선택");
                break;
            case "1":
                System.out.println("1 선택");
                break;
            case "2":
                System.out.println("2 선택");
                break;
            default:
                System.out.println("오류");
        }
        
        if("0".equals(num)) System.out.println("0 선택");
        else if("1".equals(num)) System.out.println("1 선택");
        else if("2".equals(num)) System.out.println("2 선택");
        else System.out.println("오류");

    }

}
