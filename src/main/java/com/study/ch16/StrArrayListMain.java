package com.study.ch16;

import java.util.ArrayList;

public class StrArrayListMain {

    public static void main(String[] args) {
        // ArraList<E> : 요소
        ArrayList<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("d");

        System.out.println(strList);
        System.out.println(strList.get(3));
        System.out.println(strList.indexOf("c"));
        System.out.println(strList.indexOf("e"));
        System.out.println(strList.remove(1));
        System.out.println(strList);

    }

}
