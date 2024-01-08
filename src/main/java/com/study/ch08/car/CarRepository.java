package com.study.ch08.car;

public class CarRepository {
    final Car[] cars; // 상수 : 무조건 있어야 함(필수 및 한번은 초기화 되어야 함)

    // AllArgsConstructor
    public CarRepository(Car[] cars) {
        this.cars = cars;
    }

    int getEmptyIndex() {
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] == null) {
                return i;
            }
        }
        return -1;
    }

    void insert(Car car) {
        cars[getEmptyIndex()] = car;
    }

    Car[] getCarDatas() {
        int carCount = 0;
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] != null) {
                carCount++;
            }
        }

        Car[] newCars = new Car[carCount];
        int j = 0;
        for(int i = 0; i < newCars.length; i++) {
            if(cars[i] != null) {
                newCars[j] = cars[i];
                j++;
            }
        }

        return newCars;
    }

}
