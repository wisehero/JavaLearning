package ch07.exam03;

public class Computer extends Calculator {
    @Override // 이 어노테이션은 생략이 가능하나 실수를 줄이기위해 생략하지 않는 것이 바람직하다.
    double areaCircle(double r) { // 리턴타입과 메소드명, 매개변수가 같다.
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
