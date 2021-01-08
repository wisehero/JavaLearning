package ch07.AbstractClassAndMethod.exam02;

public class Dog extends Animal {
    // 생성자
    public Dog() {
        this.kind = "포유류";
    }

    // 추상 메소드 재정의
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
