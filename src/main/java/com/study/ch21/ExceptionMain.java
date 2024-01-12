package com.study.ch21;

public class ExceptionMain {

    public static void main(String[] args) {
        // numArray 배열을 생성하고 즉시 값 주입
        int[] numArray = new int[] {1, 2, 3, 4, 5}; // 값을 5개 주입해서 배열의 크기는 5

        for(int i = 0; i < 6; i++) {
            try {
                System.out.println(numArray[i]);
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException 발생!!!");
            }
        }

        System.out.println("프로그램 정상 종료");
        
    }

}
