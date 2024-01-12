package com.study.ch19;

import lombok.Builder;
import lombok.ToString;

// @Builder // 빌더 패턴 사용 어노테이션(@) by lombok
@ToString
public class Car {
    private String model;
    private String color;

    // AllArgsConstructor
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder {
        private String model;
        private String color;

        public Car build() {
            return new Car(model, color);
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

    }


}
