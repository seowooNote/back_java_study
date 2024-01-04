package com.study.ch07.academy;

public class AcademyDB {

    void insert(AcademyEntity academyEntity) {
        System.out.println("DB에 Insert 완료");
        System.out.println("[Academy 유저 정보입니다.]");
        System.out.println("유형: " + academyEntity.type);
        System.out.println("이름: " + academyEntity.name);
        System.out.println("나이: " + academyEntity.age);
        System.out.println("연락처: " + academyEntity.phone);
    }

}
