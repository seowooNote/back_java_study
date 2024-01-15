package com.study.test2.test01;

public class Factory {

    private String factoryName;
    private static Factory instance;

    private Factory() {

    }

    public static Factory getInstance() {
        if(instance == null) {
            return new Factory();
        }
        return instance;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "factoryName='" + factoryName + '\'' +
                '}';
    }

}