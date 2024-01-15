package com.study.test1.test02;


import java.util.List;

public class SubjectService {
    private List<String> subjcts;

    public SubjectService(List<String> subjcts) {
        this.subjcts = subjcts;
    }

    public void showSubjects() {
//        int length = 4;
//        for(int i = 0; i < length; i++) {
//            System.out.println(subjcts.get(i));
//        }

        for(String subject  : subjcts) {
            System.out.println(subject);
        }
    }

}
