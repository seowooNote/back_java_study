package com.study.ch02;

public class PersonMain {

    public static void main(String[] args) {
        // p와 p2의 주소는 서로 다르다(new Person()이 새로운 주소(새로운 메모리 공간)를 생성하기 때문)

        Person p = new Person();
        p.name = "홀길동";
        p.age = 30;
        System.out.println(p);
        System.out.println(p.name);
        System.out.println(p.age);

        Person p2 = new Person();
        p2.name = "홀길동2";
        p2.age = 40;
        System.out.println(p2);
        System.out.println(p2.name);
        System.out.println(p2.age);

        StudentType student1 = new StudentType();
        StudentType student2 = new StudentType();
        StudentType student3 = new StudentType();

        student1.name = "홀길동";
        student1.grade = 1;
        student1.address = "서울 강남구";

        student2.name = "홀길동2";
        student2.grade = 2;
        student2.address = "대구 ㅇㅇㅇ";

        student3.name = "홀길동3";
        student3.grade = 3;
        student3.address = "부산 사하구";

        System.out.println("이름: " + student1.name);
        System.out.println("학년: " + student1.grade + "학년");
        System.out.println("주소: " + student1.address);
        System.out.println("-------------------------");

        System.out.println("이름: " + student2.name);
        System.out.println("학년: " + student2.grade + "학년");
        System.out.println("주소: " + student2.address);
        System.out.println("-------------------------");

        System.out.println("이름: " + student3.name);
        System.out.println("학년: " + student3.grade + "학년");
        System.out.println("주소: " + student3.address);
        System.out.println("-------------------------");

        // 각각의 변수의 주소값은 다르다(new StudentType()이 새로운 메모리 공간)을 생성하기 때문)
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        int a = 10;
        double b = a;

        // 실행 O
        // Person p3 = student1;
        // StudentType student4 = (StudentType) p3;
        // System.out.println(p);

        // 실행 X -> 오류
        // Person 홍길동 = new Person();
        // StudentType 홍길동학생 = (StudentType) 홀길동;

        StudentType 홀길동학생 = new StudentType();
        Person 홀길동사람 = 홀길동학생;
        StudentType 홀길동학생2 = (StudentType) 홀길동사람;
    }

}