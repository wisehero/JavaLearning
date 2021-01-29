package ch12.multiThread.exam05;

// 하나의 공유 객체를 두 개의 스레드가 사용할 시에 발생하는 문제를 다룬 코드

public class MainThreadExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start();

        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();
    }
}
