package com.study.ch19;

import lombok.Builder;
import lombok.Data;

@Builder // @AllArgsConstructor 포함
@Data
public class Member {
    private String name;
    private String phone;
}
