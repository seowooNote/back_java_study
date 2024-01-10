package com.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Student2 {
    @NonNull
    private final String NAME;
    private String address;
    @NonNull
    private final String PHONE;
}
