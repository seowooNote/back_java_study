package com.study.ch17;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // HashMap 키와 값으로 구성

        map.put("하나", "하나");
        map.put("하나", "하나");
        map.put("하나", "하나");
        map.put("둘", "하나");
        map.put("셋", "셋");
        map.put("넷", "넷");
        map.put("다섯", "넷");

        System.out.println(map);
        System.out.println(map.get("셋"));


    }

}
