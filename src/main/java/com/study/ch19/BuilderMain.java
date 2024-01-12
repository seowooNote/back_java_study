package com.study.ch19;

public class BuilderMain {

    public static void main(String[] args) {
        // Car car = new Car("porche", "red");

        // Car car2 = new Car();
        // car2.setModel(); // 생성한 후에 데이터를 주입(빌더 패턴을 이용하지 않는 방법)

        // 빌더 패턴을 사용한 객체 생성(by lombok)
        // .builder() : static 메소드로 정의되어 있음
//        Car car = Car.builder()
//                    .model("porche")
//                    .color("red")
//                    .build();
//        System.out.println(car);

        // 빌터 패턴을 사용한 객체 생성(by not lombok)
        Car car = Car.builder().model("porche").color("red").build();
        Car car2 = Car.builder().model("porche").build();
        System.out.println(car);
        System.out.println(car2);


        Member member = Member.builder()
                .name("홍길동")
                .phone("갤럭시")
                .build();
        System.out.println(member);

    }

}
