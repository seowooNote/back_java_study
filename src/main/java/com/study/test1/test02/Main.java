package com.study.test1.test02;

import java.util.Arrays;
import java.util.List;

// 아래 Java 코드를 실행한 결과 ArrayIndexOutOfBoundsException 오류가 발생하였다. 원인이 무엇인지 설명하고 올바른 결과를 출력하도록 수정하시오.

public class Main {

    public static void main(String[] args) {

        List<String> subjects = Arrays.asList(new String[]{"C", "Java", "Python"});
        SubjectService subjectService = new SubjectService(subjects);
        subjectService.showSubjects();

    }

}
