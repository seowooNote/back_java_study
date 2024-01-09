package com.study.ch13.singleton;

public class Academy {
    private int codeNumber;
    private String type;
    private String name;

    public Academy(int codeNumber, String type, String name) {
        this.codeNumber = codeNumber;
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Academy{" +
                "codeNumber=" + codeNumber +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
