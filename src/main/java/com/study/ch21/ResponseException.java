package com.study.ch21;

import lombok.Getter;

import java.util.Map;

@Getter
public class ResponseException extends RuntimeException {

    private Map<String, Object> errorMap;
    
    // errorMap 과 상관이 없는 생성자 오버로딩(그냥 느낌만 봐)
    public ResponseException(String message) {
        super(message);
    }

    public ResponseException(String message, Map<String, Object> errorMap) {
        super(message);
        this.errorMap = errorMap;
    }

}
