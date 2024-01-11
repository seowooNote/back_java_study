package com.study.ch16;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMainV2 {
    private static ArrayList<Member> members = new ArrayList<>(); // *

    public static String inputSearchName(String label) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(label + " >> ");
        return scanner.nextLine();
    }

    public static Member findMemberByName(String name) {
        for(Member member : members) {
            if(member.getName().equals(name)) {
                    return member;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedMenu = null;
        
        while(true) {
            System.out.println("[회원 관리 프로그램]");
            System.out.println("[1. 회원 등록]");
            System.out.println("[2. 회원 이름 수정]");
            System.out.println("[3. 회원 주소 수정]");
            System.out.println("[4. 회원 이름으로 조회]");
            System.out.println("[5. 회원 전체 조회]");
            System.out.println("[6. 회원 삭제]");
            System.out.println("[q. 프로그램 종료]");

            System.out.print("[메뉴 선택] 입력 >> ");
            selectedMenu = scanner.nextLine();
            
            // 1번 -> 5번 -> 4번 -> 6번 -> 2번 or 3번

            if("q".equalsIgnoreCase(selectedMenu)) {
                break;
            } else if("1".equals(selectedMenu)) {
                /*
                 * [회원 등록하기]
                 * 이름 입력 >> 홍길동
                 * 주소 입력 >> 대한민국
                 * [회원 등록이 완료되었습니다.]
                */
                String name = null;
                String address = null;

                System.out.print("[회원 등록하기]");

                System.out.print("이름 입력 >> ");
                name = scanner.nextLine();
                System.out.print("주소 입력 >> ");
                address = scanner.nextLine();

                Member member = new Member(name, address);
                members.add(member);

                System.out.println("[회원 등록이 완료되었습니다.]");

            } else if("2".equals(selectedMenu)) {
                /*
                 * [회원 이름 수정하기]
                 * 수정할 회원의 대상 이름 검색 >> 홍길동
                 * 해당 이름의 회원이 존재하지 않습니다. (검색 안될 경우)
                 * 수정할 회원의 이름 입력 >> 수정함
                 * [수정이 완료되었습니다.]
                */

                String updateName = null;

                System.out.println("[회원 이름 수정하기]");
                String searchName = inputSearchName("수정할 회원의 대상 이름 검색");
                Member findMember = findMemberByName(searchName);

                if(findMember == null) {
                    System.out.println("[해당 이름의 회원이 존재하지 않습니다.]");
                    continue;
                }

                System.out.print("수정할 회원의 이름 입력 >> ");
                updateName = scanner.nextLine();

                findMember.setName(updateName);
                System.out.println("[수정이 완료되었습니다.]");

            } else if("3".equals(selectedMenu)) {
                /*
                 * [회원 주소 수정하기]
                 * 수정할 회원의 이름 >> 홍길동
                 * 수정할 회원의 기존 주소 >> 대한민국
                 * 수정할 회원의 주소 입력 >> 수정함
                 * [수정이 완료되었습니다.]
                 */

                String updateAddress = null;

                System.out.println("[회원 이름 수정하기]");
                String searchName = inputSearchName("수정할 회원의 대상 이름 검색");
                Member findMember = findMemberByName(searchName);

                if(findMember == null) {
                    System.out.println("[해당 이름의 회원이 존재하지 않습니다.]");
                    continue;
                }

                System.out.print("수정할 회원의 기존 주소 >> " + findMember.getAddress());

                System.out.print("수정할 회원의 주소 입력 >> ");
                updateAddress = scanner.nextLine();

                findMember.setAddress(updateAddress);
                System.out.println("[수정이 완료되었습니다.]");

            } else if("4".equals(selectedMenu)) {
                /*
                 * [회원 이름 조회하기]
                 * 조회할 회원의 이름 입력 >> 수정됨
                 * Member 객체 toString 호출;
                 * [회원 조회가 완료되었습니다.]
                */

                String searchName = null;

                System.out.println("[회원 이름 조회하기]");
                searchName = inputSearchName("조회할 회원의 이름 입력");

                Member findMember = findMemberByName(searchName);
                if(findMember == null) {
                    System.out.println("[해당 이름의 회원이 존재하지 않습니다.]");
                    continue;
                }

                System.out.println(findMember);
                System.out.println("[회원 조회가 완료되었습" +
                        "니다.]");

            } else if("5".equals(selectedMenu)) {
                /*
                 * [회원 전체 조회하기]
                 * MemberList 전체 반복 toString 호출;
                 * [회원 전체 조회가 완료되었습니다.]
                */

                System.out.println("[회원 전체 조회하기]");

                if(members.size() != 0) {
                    for(Member member : members) {
                        System.out.println(member);
                    }
                    System.out.println("[회원 전체 조회가 완료되었습니다.]");
                } else {
                    System.out.println("[등록된 회원이 없습니다.]");
                }

            } else if("6".equals(selectedMenu)) {
                /*
                 * [회원 이름 삭제하기]
                 * 삭제할 이름 입력 >> 수정됨
                 * 삭제 된 Member 객체 toString 호출(.remove()로 리턴 가능)
                 * [회원 삭제가 완료되었습니다.]
                */

                String searchName = null;
                Member findMember = null;

                System.out.println("[회원 이름 삭제하기]");

                System.out.print("삭제할 이름 입력 >> ");
                searchName = scanner.nextLine();

                for(Member member : members) {
                    if(member.getName().equals(searchName)) {
                        findMember = member;
                        break;
                    }
                }

                if(findMember == null) {
                    System.out.println("[해당 이름의 회원이 존재하지 않습니다.]");
                    continue;
                }

                // members.remove(members.indexOf(findMember));
                members.remove(findMember);
                System.out.println(findMember);
                System.out.println("[회원 삭제가 완료되었습니다.]");

            } else {
                System.out.println("[다시 입력해주세요]");
            }
            System.out.println();
        }

        System.out.println("[프로그램 종료]");

    }

}
