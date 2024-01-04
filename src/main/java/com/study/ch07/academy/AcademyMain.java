package com.study.ch07.academy;

import java.util.Scanner;

public class AcademyMain {

    public static void main(String[] args) {

            AcademyService academyService = new AcademyService();

            Scanner scanner = new Scanner(System.in);

            System.out.print("유형을 입력하세요(학생, 강사, 직원) >>> ");
            String type = scanner.nextLine();
            if (academyService.isBlankString(type)) {
                System.out.println("유형을 다시 입력하세요");
                return;
            }

            System.out.print("이름을 입력하세요 >>> ");
            String name = scanner.nextLine();
            if (academyService.isBlankString(name)) {
                System.out.println("이름을 다시 입력하세요");
                return;
            }

            System.out.print("나이를 입력하세요 >>> ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("연락처를 입력하세요 >>> ");
            String phone = scanner.nextLine();
            if (academyService.isBlankString(phone)) {
                System.out.println("연락처를 다시 입혁하세요");
                return;
            }

            scanner.close();

            AcademyEntity academyEntity = new AcademyEntity(type, name, age, phone);

            academyService.registerAcademyService(academyEntity);



    }

}
