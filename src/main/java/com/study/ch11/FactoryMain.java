package com.study.ch11;

import com.study.ch01.PrintStudy;

public class FactoryMain {

    public static void main(String[] args) {
        Company company = new Company();
        company.setName("삼성");
        //company.showCompanyInfo();

        Phone phone1 = new Phone(company);
        Phone phone2 = new Phone(company);
        Phone phone3 = new Phone(company);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        // SamsungCompany 일반클래스에 변수와 메소드를 static으로 선언하게 되면 스택 메모리에 저장되며
        // 클래스 명만 사용하여 호출이 가능하다(new ~ 사용한해도 됨)
        // SamsungCompany.showCompanyInfo();
    }

}
