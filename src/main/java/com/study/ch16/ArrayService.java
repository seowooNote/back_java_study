package com.study.ch16;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ArrayService {
    private String[] strArray;

    public void add(String str) {
        // System.out.println("add 함수 실행 -> 값을 넣어줍니다...");
        String[] newArray = new String[strArray.length + 1];
        for(int i = 0; i < strArray.length; i++) {
            newArray[i] = strArray[i];
        }
        strArray = newArray;
        strArray[strArray.length - 1] = str;
    }

    public void remove(int index) {
        // 기존보다 크기가 1 작은 배열을 새로 만든다.
        // 매개변수로 받은 인덱스의 값을 기준으로 작은 index들은 그래도 옮기고 큰 인덱스들은 -1하여 옮긴다.
        // strArray의 배열은 새로운 배열로 바꾼다.

        // 새로운 배열 생성(기본보다 크기가 -1 인 배열)
        String[] newArray = new String[strArray.length - 1];
        // 로직
        for(int i = 0; i < newArray.length; i++) {
            // 1) index 값을 기준으로 그보다 작은 값들은 그대로 배열에 저장
            // 2) 아닌 경우의 나머지 값들은 처리
//            if(i < index) {
//                newArray[i] = strArray[i];
//            } else {
//                newArray[i] = strArray[i + 1];
//            }
            // newArray[i] = i < index ? strArray[i] : strArray[i+1];
            newArray[i] = strArray[i < index ? i : i + 1];
        }
        // 로직으로 구현한 newArray 배열의 주소를 strArray에 재할당
        strArray = newArray;
    }

    public String get(int index) {
        return strArray[index];
    }

    public int indexOf(String str) {
        if(str == null) {
            return -1;
        }
        for(int i = 0; i < strArray.length; i++) {
            if(strArray[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String result = "Array[";
        for(int i = 0; i < strArray.length; i++) {
            result += strArray[i];
            if(i < strArray.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}
