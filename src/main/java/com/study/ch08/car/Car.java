package com.study.ch08.car;

public class Car {
    String model = null;
    String color = null;

    // NoArgsConstructor
//    public Car() {
//
//    }

    // RequiredArgsConstructor
//    public Car(String model) {
//        this.model = model;
//    }

    // AllArgsConstructor
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // toString
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
