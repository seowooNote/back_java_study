package com.study.ch08.member;

public class MemberRepository {
    Member[] members = new Member[3];
    
    int insert(Member member) {
        for(int i = 0; i < members.length; i++) {
            if(members[i] == null) {
                members[i] = member;
                break;
            }
        }
        System.out.println("저장소에 Member 저장");
        System.out.println(member.toString());
        return 1;
    }
    
}
