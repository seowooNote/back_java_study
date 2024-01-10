package com.study.ch14;

public class StudentMain {

    public static void main(String[] args) {
        Student student = new Student("홍길동", "000-0000-0000", "대한민국", 20);
        System.out.println(student); // toString()

        Student2 student2 = new Student2("홍길동", "000-0000-0000");
        System.out.println(student2);
    }

}
