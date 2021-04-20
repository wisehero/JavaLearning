package JavaStandard.ch13.exam12;

public class ThreadEx12 {
    public static void main(String[] args) {
        ThreadEx12_1 th1 = new ThreadEx12_1();
        ThreadEx12_2 th2 = new ThreadEx12_2();
        th1.start();
        th2.start();

        try {
            th1.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.print("<< main end >>");
    }


}

class ThreadEx12_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++)
            System.out.print("-");
        System.out.print("<< th1 end >> ");
    }
}

class ThreadEx12_2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++)
            System.out.print("|");
        System.out.print("<< th2 end >>");
    }
}
