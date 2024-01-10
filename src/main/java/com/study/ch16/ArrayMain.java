package com.study.ch16;

public class ArrayMain {

    public static void main(String[] args) {
        String[] initStrArray = new String[0];
        ArrayService arrayService = new ArrayService(initStrArray);
        arrayService.add("홍길동1");
        arrayService.add("홍길동2");
        arrayService.add("홍길동3");
        arrayService.add("홍길동4");
        arrayService.add("홍길동5");
        System.out.println(arrayService.toString());
        System.out.println(arrayService.indexOf("홍길동3")); // 2 (찾음 -> strArray[2] 위치)
        System.out.println(arrayService.indexOf("홍길동")); // -1 (못찾음)

        arrayService.remove(0);
        System.out.println(arrayService.toString());

        System.out.println(arrayService.get(0));
    }

}
