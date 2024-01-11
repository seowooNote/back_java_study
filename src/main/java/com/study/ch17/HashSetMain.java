package com.study.ch17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;

public class HashSetMain {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("가");
        nameList.add("나");
        nameList.add("나");
        nameList.add("다");
        nameList.add("다");
        nameList.add("라");
        nameList.add("마");
        nameList.add("마");
        nameList.add("바");

        System.out.println(nameList);

        // addAll 은 중복제거용으로 활용 (ArrayList(중복 O) -> HashSet(중복 X))
        HashSet<String> names = new HashSet<>();
        names.addAll(nameList);
        System.out.println(names);

        ArrayList<String> newNameList = new ArrayList<>();
        newNameList.addAll(names);
        // *
        // 한글정렬(오름차순)
        // 익명클래스 사용
        newNameList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Objects.hash(o1) - Objects.hash(o2);
            }
        });

        System.out.println(newNameList);

//        names.add("0");
//        names.add("1");
//        names.add("2");
//        names.add("3");
//        names.add("4");



//        for(String name : names) {
//            System.out.println(name);
//        }
//
//        System.out.println();
//
//        String findName = null;
//        for(String name : names) {
//            if(name.equals("0")) {
//                findName = name;
//                break;
//            }
//        }
//
//        System.out.println(findName);

    }
}
