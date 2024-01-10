package com.study.ch16;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode
public class Student {
    private String name;
    private int age;
}
