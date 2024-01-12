package com.study.ch21;

import java.util.ArrayList;
import java.util.List;

public class ExceptionMain2 {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("홍길일");
        nameList.add("홍길이");
        nameList.add(null);
        nameList.add("홍길사");

        try {
            for(int i = 0; i < 5; i++) {
                String name = nameList.get(i);
                if(name.equals("홍길사")) {
                    System.out.println("홍길사를 찾음!!!");
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("NullPointerException 발생!!!");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("IndexOutOfBoundsException 발생!!!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception 발생!!!(모든 예외처리의 부모)");
        } finally {
            System.out.println("이거는 무조건 실행됨(finally)");
        }

    }

}
