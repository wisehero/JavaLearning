package ch07.PromotionAndPolymorphism.exam05;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        // parent.filed2 = "data2" 불가능
        // parent.method3() 불가능

        Child child = (Child)parent; // 강제 타입 변환 부모 -> 자식
        child.field2 = "yyy";
        child.method3();

        // 강제 타입 변환은 자식 타입이 부모 타입으로 변환되어 있는 상태에서만 가능하다.
        // 타입을 확인하지 않고 강제 타입 변환을 시도한다면 ClassCastException이 발생한다.

    }
}
