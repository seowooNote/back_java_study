package com.study.ch05;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();

        System.out.print("제목: ");
        scanner.nextLine();
        // scanner.skip("[\\r\\n]+"); // 이것도 scanner.nextLine();의 효과를 줄 수 있음
        // String title = scanner.next(); // 개행문자를 가져오지 않음(공백을 입력의 끝으로 봄)
        String title = scanner.nextLine(); // 개행문자를 가져옴(공백을 포함한 전체를 끝으로 봄)

        scanner.close();

        System.out.println(title + ": " + (a + b + c));
    }

}
