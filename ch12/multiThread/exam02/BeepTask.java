package ch12.multiThread.exam02;

// 비프음을 들려주는 것은 작업 스레드가 담당하고 출력은 메인 스레드가 담당하는 코드

import java.awt.*;

public class BeepTask implements Runnable {
    public void run() {
        // 스레드 실행 내용
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i < 5; i++) {
            toolkit.beep();
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }

}
