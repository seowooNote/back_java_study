package com.study.ch14;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
    // @Getter
    // @Setter
    // @ToString
    // @EqualsAndHashCode
public class Student {
    private String name;
    private String phone;
    private String address;
    private int age;
}
