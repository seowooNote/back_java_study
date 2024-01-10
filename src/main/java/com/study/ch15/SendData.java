package com.study.ch15;

import lombok.AllArgsConstructor;

@AllArgsConstructor
// <T> : type
public class SendData<T> {
    private int code;
    private T data;

    public void send() {
        System.out.println("[데이터 전송]");
        System.out.println("code: " + code);
        System.out.println("data: " + data);
    }
}
