package com.study.test2.test01;

public class FactoryMain {

    public static void main(String[] args) {

        Factory factory = Factory.getInstance();
        factory.setFactoryName("factoryName");
        System.out.println(factory.toString());

    }

}
