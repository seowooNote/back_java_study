package com.study.ch16;

import com.study.ch11.Phone;

import java.util.ArrayList;

public class StudentListMain {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("홍길동1", 10));
        students.add(new Student("홍길동2", 20));
        students.add(new Student("홍길동3", 30));
        students.add(new Student("홍길동4", 40));

        System.out.println(students);

        // .set() 메소드 : ArrayList 내장 메소드 / 해당 인덱스 주소에 값을 변경 및 수정할때 사용
        students.set(0, new Student("변경됨", 40));

        System.out.println(students); // .toString()

        // for(int i = 0; i < students.size(); i++) {
            // students.get(i).setAge(students.get(i).getAge() + 1);
            // Student student = students.get(i);
            // student.setAge(student.getAge() + 1);
        // }

        // 향상된 for문
        // 반복이 처음부터 끝까지 실행해야 할 경우
        // 나중에 람다식으로 바뀜
        for(Student student : students) {
            student.setAge(student.getAge() + 1);
        }

        // 람다식
        // students.forEach(student -> student.setAge(student.getAge() + 1));

        System.out.println(students);

        Student[] studentArray = new Student[4];
        for(int i = 0; i < studentArray.length; i++) {
            studentArray[i] = new Student("가나다", 31);
        }

        // 향상된 for 문으로는
        // Student student;
        // student = new Student("가나다", 31);
        // 위의 코드 형태이기 때문에 배열을 생성하는 것이 아니라, 변수에 할당하므로 구현할 수 없다.
        // 즉, studentArray 배열에 값들을 할당할 수 없다. (배열에 집어넣는 행위가 아니다.)
        // studentArray[i] = new Student("가나다", 31); 이렇게 안됨
        
        // for(Student student : studentArray) {
        //    student = new Student("가나다", 31);
        // }

        // 그렇다면 향상된 for 문으로 만들려면?
        // 이렇게 하면 가능은 하나 별로 바람직하지 않다. (기존 for 문이 효율적)
        // int i = 0;
        // for(Student student : studentArray) {
        //    studentArray[i] = new Student("가나다", 11);
        //    i++;
        // }



        // 향상된 for 문은 배열의 값을 확인할때는 유용
        for(Student student : studentArray) {
            System.out.println(student);
        }

    }

}
