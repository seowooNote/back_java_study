package com.study.ch19;

import java.util.ArrayList;

public class StudentMain {

    public static void main(String[] args) {
        Student student1 = Student.builder().name("홍길동").address("대한민국").age(20).build();
        Student student2 = Student.builder().name("홍길동").age(20).build();
        Student student3 = Student.builder().address("대한민국").age(20).build();
        Student student4 = Student.builder().name("홍길동").address("대한민국").build();
        Student student5 = Student.builder().build();

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);

        System.out.println();

        System.out.println("------------------ List로 넣기 ------------------");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for(Student studentInfo : students) {
            System.out.println(studentInfo);
        }

    }

}
