package com.study.ch07.academy;

public class AcademyRepository {

    void save(AcademyEntity academyEntity) {
        AcademyDB academyDB = new AcademyDB();
        academyDB.insert(academyEntity);
    }

}
