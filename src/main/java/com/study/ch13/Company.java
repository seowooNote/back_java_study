package com.study.ch13;

/*
* 문제: Company 클래스를 싱글톤을 적용하여 구현하시오
*/

public class Company {
    private static Company instance; // 싱글톤에서 자기자신 private static
    private String name; // ex. 싱글톤에서 무시

    // 싱글톤에서 NoArgsConstructor 접근지정자 private
    private Company() {

    }

    // 싱글톤에서 instance의 null 값 유무에 따라 instance 생성하는 메소드 public static
    public static Company getInstance() {
        if(instance == null) {
            instance = new Company();
        }
        return instance;
    }


}
