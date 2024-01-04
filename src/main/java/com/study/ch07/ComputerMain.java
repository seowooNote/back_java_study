package com.study.ch07;

public class ComputerMain {

    public static void main(String[] args) {
        Computer computer1 = new Computer(); // 객체 생성(동적 메모리 할당(+주소값))
        Computer computer2 = new Computer("노트북"); // 또다른 메모리를 할당(+주소값) / 값을 주입한다

        // computer1과 computer2의 주소(값)가 서로 다르다(각각의 새로운 메모리 주소(값)를 가지고 있음)
        System.out.println("computer1의 주소값: "+ computer1);
        System.out.println("computer2의 주소값: "+ computer2);

        System.out.println();

        computer1.cpu = "i5";
        computer2.cpu = "i7";

        System.out.println("computer1.cpu: " + computer1.cpu);
        System.out.println("computer2.cpu: " + computer2.cpu);

        System.out.println();

        computer1.showInfo();
        computer2.showInfo();

        computer1.ram = "8GB";
        computer2.ram = "16GB";

        computer1.showInfo();
        computer2.showInfo();

        computer1.disk = "HDD";
        computer2.disk = "SDD";

        computer1.showInfo();
        computer2.showInfo();
    }

}
