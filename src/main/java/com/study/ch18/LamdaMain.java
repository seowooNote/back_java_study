package com.study.ch18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LamdaMain {

    public static void main(String[] args) {

        Runnable start = () -> {
            System.out.println("프로그램을 실행합니다.");
            System.out.println("데이터를 초기화합니다.");
            int a = 10;
            int b = 20;
            System.out.println("a + b = " + (a + b));
        };
        start.run();

        Supplier<Integer> supplier1 = () -> 10;
        int a = supplier1.get();

        Supplier<Scanner> supplier2 = () -> new Scanner(System.in);
//        System.out.print("입력 >> ");
//        supplier2.get().nextLine();

        Consumer<String> setName = (name) -> {
            String newName = name + "님";
            System.out.println(newName);
        };
        setName.accept("홍길동");

        ArrayList<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");

        Consumer<String> action = str -> System.out.println(str);
        action.accept("가나다");
        strList.forEach(action);
        strList.forEach(str -> System.out.println(str));

        Function<Integer, String> fx1 = num -> Integer.toString(num * num);
        String result = fx1.apply(10);
        System.out.println(result);

        System.out.println();

        String result2 = fx1.andThen(num -> {
            System.out.println("andThen에 넣은 함수 " + num);
            return "문자열 " + num;
        }).apply(10);

        System.out.println(result2);

        Predicate<Integer> filterFx = num -> num % 2 == 0;
        List<Integer> numList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            numList.add(i + 1);
        }
        System.out.println(numList);

        // .stream() -> stream 객체로 변환 (.filter(), .map(), .collect() 사용 가능해짐)
        List<Integer> newList = numList.stream().filter(filterFx).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList2 = newList.stream().map(num -> num * 2).collect(Collectors.toList());
        System.out.println(newList2);

    }

}
