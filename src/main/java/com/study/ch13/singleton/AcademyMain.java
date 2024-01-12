package com.study.ch13.singleton;

import java.util.Scanner;

public class AcademyMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AcademyService1 academyService1 = new AcademyService1(scanner);
        AcademyService2 academyService2 = new AcademyService2(scanner);
        academyService1.create();
        academyService2.create();
    }

}
