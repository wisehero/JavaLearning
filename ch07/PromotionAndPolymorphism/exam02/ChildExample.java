package ch07.PromotionAndPolymorphism.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child; // 자동 타입 변환
        parent.method1();  // parent의 메서드를 그대로 호출
        parent.method2(); // child에서 재정의된 메서드를 가져온다.
        // parent.method3(); 호출 불가능

    }
}

/*  그렇다면 우리는 왜 자동 타입 변환을 할까?
    다형성을 구현하기 위해서다.
    필드의 타입을 부모 타입으로 선언하면 다양한 자식 객체들이 저장될 수 있다.
    그러므로 필드의 사용 결과가 달라질 수 있다.*/