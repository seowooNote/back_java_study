package com.study.test1.test01;

public class Main {
/*
 * 주어진 프로그램 설계서(명세서)를 참고하여 Java 프로그램을 작성하시오.
 * 내용
 * 클래스(Class)명	Calculator
 * 접근지정자	public
 * 메소드(Method) 명	add
 * 입력 매개변수(타입/명)	int num1, int num2
 * 반환값(타입)	int
 * 처리 내용	return num1 + num2
 * 메소드(Method) 명	sub
 * 입력 매개변수(타입/명)	int num1, int num2
 * 반환값(타입)	int
 * 처리 내용	return num1 - num2
 *
 * 클래스(Class)명	Main
 * 접근지정자	public
 * 메소드(Method) 명	main
 * 입력 매개변수(타입/명)	String[] args
 * 반환값(타입)	void
 * 처리 내용
 * 1. static 메소드로 정의
 * 2. Calculator 객체 생성
 * 3. add(10, 20) 리턴값 출력
 * 4. sub(200, 100) 리턴값 출력
 */
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.sub(200, 100));

    }

}
