package com.study.ch07;

import java.awt.*;

public class UserMain {

    public static void main(String[] args) {
        User01 user01 = new User01("aaa", "0000");
        User01 user02 = new User01("bbb", "1111", "홍길동", "email@email.com");

        System.out.println("[User01의 유저 정보]");
        user01.showInfo();
        System.out.println("----------------------------------");
        System.out.println("[User02의 유저 정보]");
        user02.showInfo();

        System.out.println("----------------------------------");
        
        user01.setName("변경한 홍길동");
        user01.setEmail("email@email123.com");

        System.out.println("[User01 변경 사항 적용 후 유저 정보]");
        user01.showInfo();
    }

}
