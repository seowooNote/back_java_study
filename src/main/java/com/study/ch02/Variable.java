package com.study.ch02;

public class Variable {

    public static void main(String[] args) {
        int date = 202311230;
        // double(실수)는 int(정수)를 포함하므로 가능
        double date2 = date; // 업캐스팅(묵시적 형변환)
        // int(정수)는 double(실수)를 포함하지 않으므로 불가능
        int date3 = (int) date2; // 다운캐스팅(명시적 형변환)

        // 형변환: 문자 < 정수 < 실수

        // 업캐스팅(묵시적 형변환)
        char a = '1';
        int b = a;
        double c = b;
        System.out.println(c);

        System.out.println(202311229 + 1);
        System.out.println(202311229 + 2);
        System.out.println(202311229 + 3);
        System.out.println(202311229 + 4);
        System.out.println(202311229 + 5);
        System.out.println(202311229 + 6);
        System.out.println(202311229 + 7);
        System.out.println(202311229 + 8);
        System.out.println(202311229 + 9);

        System.out.println(date + 1);
        System.out.println(date + 2);
        System.out.println(date + 3);
        System.out.println(date + 4);
        System.out.println(date + 5);
        System.out.println(date + 6);
        System.out.println(date + 7);
        System.out.println(date + 8);
        System.out.println(date + 9);

        System.out.println(date2 + 1);
        System.out.println(date2 + 2);
        System.out.println(date2 + 3);
        System.out.println(date2 + 4);
        System.out.println(date2 + 5);
        System.out.println(date2 + 6);
        System.out.println(date2 + 7);
        System.out.println(date2 + 8);
        System.out.println(date2 + 9);

        System.out.println(date3 + 1);
        System.out.println(date3 + 2);
        System.out.println(date3 + 3);
        System.out.println(date3 + 4);
        System.out.println(date3 + 5);
        System.out.println(date3 + 6);
        System.out.println(date3 + 7);
        System.out.println(date3 + 8);
        System.out.println(date3 + 9);
    }

}
