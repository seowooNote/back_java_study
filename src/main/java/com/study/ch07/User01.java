package com.study.ch07;

public class User01 {

    final String username; // Id
    final String password; // 비밀번호
    String name; // 이름
    String email; // 이메일

    // RequiredArgsConstructor - Id, 비밀번호 생성자
    User01(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // RequiredArgsConstructor - Id, 비밀번호, 이름, 이메일 생성자
    User01(String username, String password, String name, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    // method - 이름 변경
    void setName(String name) {
        this.name = name;
    }

    // method - 이메일 변경
    void setEmail(String email) {
        this.email = email;
    }

    // method - 해당 유저 정보 확인
    void showInfo() {
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("name: " + name);
        System.out.println("email: " + email);
    }

}
