package ch07.AbstractClassAndMethod.exam01;

public class PhoneExample {
    public static void main(String[] args) {
        // Phone phone = new Phone(); 추상 클래스는 객체를 만들 수 없음.

        SmartPhone smartPhone = new SmartPhone("김지웅");

        smartPhone.turnOn(); // Phone의 메소드
        smartPhone.internetSearch();
        smartPhone.turnOff(); // Phone의 메소드

    }
}

/*
 추상 클래스는 실체 클래스가 공통적으로 가져야 할 필드와 메소드들을 정의해놓은 추상적인 클래스
 실체 클래스의 필드와 메소드를 통일하는 데 목적이 있음
 추상 클래스는 추상 메소드를 선언할 수 있음
 추상 메소드는 메소드의 선언부만 있고 메소드 실행 내용인 중괄호가 없는 메소드를 말함.
 추상 클래스 설계 시 하위 클래스가 반드시 실행 내용을 채우도록 강제하고 싶은 메소드가 있을 경우 추상 메소드 선언
 이 경우 자식 클래스는 반드시 부모 클래스의 추상 메소드를 재정의해야 함 그렇지 않으면 컴파일 에러 발생
 */
