package com.study.ch08.member;

import java.util.Scanner;

// 메소드 정의(기능)
public class MemberService {

    MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // 입력 기능
    String inputValue(String label) {
        Scanner scanner = new Scanner(System.in);
        String value = null;
        while(true) {
            System.out.print(label + " 입력(입력취소: exit 입력) >>> ");
            value = scanner.nextLine();
            if(!value.isBlank()) {
                break;
            }
        }
        return value;
    }

    // 회원 추가 기능
    boolean addMember() {
        // 코드
        String code = null;
        // 이름
        String name = null;
        // 나이
        String age = null;
        // 주소
        String address = null;

        System.out.println("[회원 등록]");
        code = inputValue("회원코드");
        if("exit".equalsIgnoreCase(code)) {
            return false;
        }
        name = inputValue("이름");
        if("exit".equalsIgnoreCase(name)) {
            return false;
        }
        age = inputValue("나이");
        if("exit".equalsIgnoreCase(age)) {
            return false;
        }
        address = inputValue("주소");
        if("exit".equalsIgnoreCase(address)) {
            return false;
        }

        // member 객체 생성
        Member member = new Member(code, name, Integer.parseInt(age), address);

        return memberRepository.insert(member) > 0; // true or false
    }

}
