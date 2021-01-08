package ch07.PromotionAndPolymorphism.exam02;

public class Child extends Parent {
    @Override
    public void method2() {
        // Parent 클래스에 있는 메소드를 재정의 한 것임
        // 부모 타입의 변수로 자동 변환 되어도 이 메소드만 호출됨
        System.out.println("Child-method2()");
    }

    public void method3() {
        System.out.println("Child-method3()");
    }
}
