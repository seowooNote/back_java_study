package com.study.ch14;

public class ObjectMain {

    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest("홍길동", "대한민국");

        // .toString()을 쓰나 안쓰나 출력 결과는 동일함(Object 클래스를 상속받고 있기 때문)
        System.out.println(objectTest.toString());
        System.out.println(objectTest);

        ObjectTest objectTest2 = new ObjectTest("홍길동", "대한민국");
        // .equals() 객체가 서로 같은지 비교 (주소는 달라도 값이 같으면 true)
        System.out.println(objectTest.equals(objectTest2)); // true => 주소는 다르나 해당 값이 서로 같아서
        // == 객체가 서로 같은지 비교 (주소로만 비교, 주소가 같으면 true)
        System.out.println(objectTest == objectTest2); // false => 주소가 달라서

        // .getClass() 해당 변수의 클래스 경로 / .instanceOf() 대신에 쓸거임
        System.out.println(objectTest.getClass());
        System.out.println(objectTest2.getClass());
        System.out.println(ObjectTest.class);

        // .hashCode() 메모리 주소를 나타냄 (같은 값을 넣으면 hashCode가 같아짐 => 주소가 달라도 값이 같으면 hashCode가 서로 같음(오로지 값만 비교한다고 생각하면 쉽다))
        System.out.println(objectTest.hashCode());
        System.out.println(objectTest2.hashCode());

    }

}
