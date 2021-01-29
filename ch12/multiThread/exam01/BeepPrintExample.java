package ch12.multiThread.exam01;

// 메인 스레드만 이용한 경우

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 얻기
        for (int i = 0; i < 5; i++) { // 5번의 비프음 발생
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }

            for (int i = 0; i < 5; i++) {
                System.out.println("띵");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }

    }}
