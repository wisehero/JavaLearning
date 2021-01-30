package ch12.threadControl.exam01;

// 스레드를 일시 정지 상태로 만드는 방법

import java.awt.Toolkit;

public class SleepExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i < 10; i++){
            toolkit.beep();
                try{
                    Thread.sleep(3000); // 3초동안 스레드를 일시 정지 상태로 만듦
                } catch (InterruptedException e) {}
        }
    }
}
