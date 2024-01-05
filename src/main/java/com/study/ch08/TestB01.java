package com.study.ch08;

public class TestB01 {

    void add(int[] array, int x, int y) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 0) {
                array[i] = x + y;
                break;
            }
        }
    }

//    void add(int x, int y) {
//        int[] nums = new int[2];
//        nums[0] = x;
//        nums[1] = y;
//        System.out.println("x + y = " + (nums[0] + nums[1]));
//
//    }

    void showArrayDatas(int[] array) {
        System.out.println("배열 값 확인");
        for(int i = 0; i < array.length; i++) {
            System.out.println("index[" + i + "] -> " + array[i]);
        }
    }

}
