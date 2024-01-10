package com.study.ch16;

import java.util.ArrayList;

public class StudentListTest {
    public static void main(String[] args) {
        ArrayList<Member> members = new ArrayList<>();

        members.add(new Member("1", "1"));
        members.add(new Member("2", "2"));
        members.add(new Member("3", "3"));
        members.add(new Member("4", "4"));
        members.add(new Member("5", "5"));

        System.out.println(members.indexOf(members.get(0).getName()));
        System.out.println(members.get(0).getName());
        System.out.println(members.get(0).getAddress());

        for(Member member : members) {

        }
        
        // for 문 써야 됨
        // Member 객체는 변수가 두개이므로 indexOf 써서는 안됨
    }
}
