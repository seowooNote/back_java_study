package com.study.ch15;

public class SendMain {

    public static void main(String[] args) {
        SendData<String> sendData1 = new SendData<>(200, "홍길동");
        // send(sendData1);
        SendData<Member> sendData2 = new SendData<>(200, new Member("홍길동", "000-0000-0000"));
        send(sendData2);

        // <> 내부에 아무것도 작성해주지 않으면 최상위 클래스인 Object 클래스
        // 이렇게는 잘 쓰지 않음
        // SendData<> sendData1 = new SendData<>(200, "홍길동");
        // sendData1.send();
        // SendData<> sendData2 = new SendData<>(200, new Member("홍길동", "000-0000-0000"));
        // sendData2.send();

        SendData<VipMember> sendData3 = new SendData<>(200, new VipMember("홍길동2", "111-2222-3333"));
        send(sendData3);
    }

    // <?> : 와일드카드 / 여러 자료형을 받아서 쓸 수 있음
    public static void send(SendData<? extends Member> sendData) {
        sendData.send();
    }

}
