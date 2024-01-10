package com.study.ch16;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedMenu = null;

        ArrayList<Member> members = new ArrayList<>();
        
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
            }else if("1".equals(selectedMenu)) {
                /*
                * [회원 등록하기]
                * 이름 입력 >> 홍길동
                * 주소 입력 >> 대한민국
                * [회원 등록이 완료되었습니다.]
                */
                System.out.println("[회원 등록하기]");
                System.out.print("이름 입력 >> ");
                String name = scanner.nextLine();
                System.out.print("주소 입력 >> ");
                String address = scanner.nextLine();

                members.add(new Member(name, address));

                System.out.println("[회원 등록이 완료되었습니다.]");
                continue;
            }else if("2".equals(selectedMenu)) {
                /*
                * [회원 이름 수정하기]
                * 수정할 회원의 대상 이름 검색 >> 홍길동
                * 해당 이름의 회원이 존재하지 않습니다. (검색 안될 경우)
                * 수정할 회원의 이름 입력 >> 수정함
                * [수정이 완료되었습니다.]
                */

                System.out.println("[회원 이름 수정하기]");
                System.out.print("수정할 대상 회원의 이름 >> ");
                String name = scanner.nextLine();

                if(members.indexOf(name) == -1) {
                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");

                }

                System.out.print("수정할 회원의 이름 입력 >> ");
                String changeName = scanner.nextLine();
                Member member =  members.get(members.indexOf(name));
                member.setName(changeName);
                members.set(members.indexOf(name), member);

                System.out.println("[수정이 완료되었습니다.]");
                continue;
            }else if("3".equals(selectedMenu)) {
                /*
                 * [회원 주소 수정하기]
                 * 수정할 회원의 이름 >> 홍길동
                 * 수정할 회원의 기존 주소 >> 대한민국
                 * 수정할 회원의 주소 입력 >> 수정함
                 * [수정이 완료되었습니다.]
                 */

                System.out.println("[회원 주소 수정하기]");
                System.out.print("수정할 대상 회원의 이름 >> ");
                String name = scanner.nextLine();

                if(members.indexOf(name) == -1) {
                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                    continue;
                }

                System.out.print("수정할 회원의 기존 주소 >> ");
                System.out.println(members.get(members.indexOf(name)).getAddress());

                System.out.print("수정할 외원의 주소 입력 >> ");
                String changeAddress = scanner.nextLine();
                Member member = members.get(members.indexOf(name));
                member.setAddress(changeAddress);
                members.set(members.indexOf(name), member);

                System.out.println("[수정이 완료되었습니다.]");
                continue;
            }else if("4".equals(selectedMenu)) {
                /*
                 * [회원 이름 조회하기]
                 * 조회할 회원의 이름 입력 >> 수정됨
                 * Member 객체 toString 호출;
                 * [회원 조회가 완료되었습니다.]
                 */

                System.out.println("[회원 이름 조회하기]");

                System.out.print("조회할 회원의 이름 입력 >> ");
                String name = scanner.nextLine();

                Member member = members.get(members.indexOf(name));


                if(member.getName() == name) {
                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                    continue;
                }
//                System.out.print("수정할 회원의 이름 입력 >> ");
//                String changeName = scanner.nextLine();
//                Member member =  members.get(members.indexOf(name));
//                member.setName(changeName);
//                members.set(members.indexOf(name), member);


//                System.out.println(members.indexOf(name));
                System.out.println(member);

                System.out.println("[회원 조회가 완료되었습니다.]");
                continue;
            }else if("5".equals(selectedMenu)) {
                /*
                 * [회원 전체 조회하기]
                 * MemberList 전체 반복 toString 호출;
                 * [회원 전체 조회가 완료되었습니다.]
                 */

                System.out.println("[회원 전체 조회하기]");

                for(Member member : members) {
                    System.out.println(member);
                }

                System.out.println("[회원 전체 조회가 완료되었습니다.]");
                continue;
            }else if("6".equals(selectedMenu)) {
                /*
                 * [회원 이름 삭제하기]
                 * 삭제할 이름 입력 >> 수정됨
                 * 삭제 된 Member 객체 toString 호출(.remove()로 리턴 가능)
                 * [회원 삭제가 완료되었습니다.]
                 */

                System.out.println("[회원 이름 삭제하기]");

                System.out.print("삭제할 이름 입력 >> ");
                String name = scanner.nextLine();

                // members.remove(members.get(members.indexOf(name)));
                System.out.println(members.remove(members.get(members.indexOf(name))));

                System.out.println("[회원 삭제가 완료되었습니다.]");
                continue;
            }else {
                System.out.println("[다시 입력해주세요]");

            }

            System.out.println();
        }

        System.out.println("[프로그램 종료]");

    }

}
