package com.study.ch21;

import com.study.ch19.Member;

import java.util.ArrayList;

public class MemberMain {

    public static void main(String[] args) {
        ArrayList<Member> members = new ArrayList<>();

        members.add(Member.builder().name("홍길동1").build());
        members.add(Member.builder().name("홍길동2").build());
        members.add(Member.builder().name("홍길동3").build());
        members.add(Member.builder().name("홍길동4").build());

        MemberService memberService = new MemberServiceImpl();
        try {
            memberService.printMemberList(members);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");

    }

}
