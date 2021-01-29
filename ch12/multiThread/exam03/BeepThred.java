package ch12.multiThread.exam03;

// 작업 스레드 클래스를 정의하여 작업을 진행하는 코드

import java.awt.*;

public class BeepThred extends Thread {
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
