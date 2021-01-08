package ch07.AbstractClassAndMethod.exam02;

public abstract class Animal {
    public String kind;

    public void breath() {
        System.out.println("숨을 쉽니다.");
    }

    public abstract void sound(); // 추상 메소드
}
