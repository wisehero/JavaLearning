package JavaStandard.ch13.exam07;

import javax.swing.JOptionPane;

public class ThreadEx7 {
    public static void main(String[] args) throws Exception {
        ThreadEx7_1 th1 = new ThreadEx7_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은" + input + "입니다.");
    }
}

class ThreadEx7_1 extends Thread {
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (Exception e) {

            }
        }
    } // run()
}

// 이 예제에서는 입력을 마치지 않아도 화면에 숫자가 출력됨
