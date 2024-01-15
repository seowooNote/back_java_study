package com.study.test2.test03;

public class Customer {

    private String name;
    private String rating;
    private int age;


    public Customer(String name, String rating, int age) {
        this.name = name;
        this.rating = rating;
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "name=" + name +
                " rating=" + rating +
                " age=" + age ;
    }

}
