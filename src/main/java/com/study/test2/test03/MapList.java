package com.study.test2.test03;

import com.study.ch15.Member;

import java.util.*;
import java.util.function.Function;

public class MapList {

    public static void main(String[] args) {

        List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();

        Map<String, Object> member1 = new HashMap<>();
        member1.put("name", "홍길동");
        member1.put("rating", "vip");
        member1.put("age", 30);
        customers.add(member1);

        Map<String, Object> member2 = new HashMap<>();
        member2.put("name", "김기영");
        member2.put("rating", "gold");
        member2.put("age", 35);
        customers.add(member2);

        for(Map<String, Object> customer : customers) {
            for(Map.Entry<String, Object> entry : customer.entrySet()) {
                System.out.println(entry);
            }
        }

    }

}
