package com.study.ch13.singleton;

public class AcademyFactory {
    // Singleton
    // 1) 자기 자신 클래스 자료형을 가지는 변수 선언(변수명은 instance 고정 / private static)
    private static AcademyFactory instance;

    private int autoCount;
    private String type;
    private String name;

    // 2) 생성자 public -> private
    private AcademyFactory() {

    }

    // 3) singleton 객체 생성 (static public / getInstance())
    static public AcademyFactory getInstance() {
        if(instance == null) {
            instance = new AcademyFactory();
        }
        return instance;
    }

    public Academy register(String type, String name) {
        autoCount++;
        return new Academy(autoCount, type, name);
    }

    @Override
    public String toString() {
        return "AcademyFactory{" +
                "autoCount=" + autoCount +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
