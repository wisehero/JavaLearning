package ch12.threadControl.exam02;

// 스레드를 안전하게 종료하는 방

public class StopFlagExample {
    public static void main(String[] args) {
        PrintThread1 printThread1 = new PrintThread1();
        printThread1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        printThread1.setStop(true);
    }
}
