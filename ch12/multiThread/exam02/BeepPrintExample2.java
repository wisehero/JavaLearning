package ch12.multiThread.exam02;

import ch12.multiThread.exam02.BeepTask;

// 메인 스레드와 작업 스레드가 동시에 실행

public class BeepPrintExample2 {
    public static void main(String[] args) {
        Runnable beepTask = new BeepTask(); // 구현 객체 생성
        Thread thread = new Thread(beepTask);
        thread.start();

        /*
        public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i < 5; i++) {
            toolkit.beep();
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
         */

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }

        }
    }
}
