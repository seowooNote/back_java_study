package com.study.ch07.academy;

public class AcademyService {

    boolean isBlankString (String str) {
        if(str == null) return true;
        return str.isBlank();
    }

    void registerAcademyService(AcademyEntity academyEntity) {
        AcademyRepository academyRepository = new AcademyRepository();

        System.out.println("서비스까지 데이터 전달함");

        academyRepository.save(academyEntity);
    }

}
