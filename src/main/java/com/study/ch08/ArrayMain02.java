package com.study.ch08;

public class ArrayMain02 {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "가나다";
        names[1] = "라마바";
        names[2] = "사아자";
        names[3] = "차카타";
        names[4] = "파하A";

        System.out.println("--------------------------");

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        System.out.println("--------------------------");

        for(int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }

        System.out.println("--------------------------");

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("--------------------------");

        for(String name : names) {
            System.out.println(name);
        }

    }
}
