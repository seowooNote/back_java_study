package com.study.ch13.singleton;

import java.util.Scanner;

public class AcademyService1 {

    private Scanner scanner;

    public AcademyService1(Scanner scanner) {
        this.scanner = scanner;
    }

    public void create() {
        System.out.println("[service1에서 등록합니다.]");
        System.out.print("유형 입력(직원, 강사, 학생) >>> ");
        String type = scanner.nextLine();
        System.out.print("이름 입력 >>> ");
        String name = scanner.nextLine();

        AcademyFactory academyFactory = AcademyFactory.getInstance();
        Academy academy = academyFactory.register(type, name);
        System.out.println(academy.toString());
    }

}
