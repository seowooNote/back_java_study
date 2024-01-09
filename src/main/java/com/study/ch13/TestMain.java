package com.study.ch13;

public class TestMain {

    public static void main(String[] args) {
        A a = new A();
        A2 a2 = new A2();
        Company company = Company.getInstance();

        // 싱글톤을 사용하지 않을때 예시
        a.a(company);
        a2.a2(company);

        // 싱글톤은 객체의 인스턴스가 오직 1개이기 때문에 주소값이 a와 a2의 주소값이 같다


    }

}
