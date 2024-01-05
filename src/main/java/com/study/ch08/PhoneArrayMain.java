package com.study.ch08;

public class PhoneArrayMain {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];
        phones[0] = new Phone("삼성", "갤럭시");
        phones[1] = new Phone("Apple", "IPhone");
        phones[2] = new Phone("샤오미", "MiPhone");

        for(int i = 0; i < phones.length; i++){
            System.out.println(phones[i].toString());
        }
    }
}
