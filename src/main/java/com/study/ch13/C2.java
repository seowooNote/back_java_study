package com.study.ch13;

public class C2 {

    public void c2(Company company) {
        System.out.println("[C2 클래스]");
        System.out.println(company);
        System.out.println("[C2 클래스 싱글톤 결과");
        // 싱글톤을 사용하는 예시
        System.out.println(Company.getInstance());
    }

}
