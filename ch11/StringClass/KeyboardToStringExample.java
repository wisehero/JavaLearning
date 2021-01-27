package ch11.StringClass;

import java.io.IOException;

// 키보드로부터 읽은 바이트 배열을 문자열로 변환하는 방법 예제
// System.in.read() 메소드는 키보드에서 입력한 내용을 매개값으로 주어진 바이트 배열에 저장하고 읽은 바이트 수를 리턴

public class KeyboardToStringExample {
    public static void main(String[] args) throws IOException {
        byte [] bytes = new byte[100]; // 읽은 바이트를 저장하기 위한 배열 생성

        System.out.print("입력: ");
        int readByteNo = System.in.read(bytes); // 배열에 읽은 바이트를 저장하고 읽은 바이트 수를 리턴

        String str = new String(bytes, 0, readByteNo-2); // 2를 빼주는 이유는 캐리지리턴과 라인피드는 문자열로 만들 필요가 없기 때문
        System.out.println(str);


    }
}
