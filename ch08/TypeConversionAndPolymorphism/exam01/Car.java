package ch08.TypeConversionAndPolymorphism.exam01;

public class Car {

    // 인터페이스 타입의 필드를 선언하고 초기 구현 객체 대입
    // 한국타이어와 금호타이어는 인터페이스 Tire의 구현 객체다.
    Tire frontLeftTire = new HankookTire();
    Tire frontRightTire = new HankookTire();
    Tire backLeftTire = new HankookTire();
    Tire backRightTire = new HankookTire();

    void run() {
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }
}
