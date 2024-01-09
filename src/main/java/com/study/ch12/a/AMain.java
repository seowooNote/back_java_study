package com.study.ch12.a;

public class AMain {

    public static void main(String[] args) {
        Student student = new Student(); // Student class의 멤버변수가 private이기 때문에 생성해도 사용할 수 없음
        student.setName("홍길동");
        System.out.println(student.getName());
        student.setAddress("대한민국");
        System.out.println(student.getAddress());
        System.out.println(student.toString());
    }

}
