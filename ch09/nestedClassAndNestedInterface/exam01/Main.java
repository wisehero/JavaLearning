package ch09.nestedClassAndNestedInterface.exam01;

public class Main {
    public static void main(String[] args) {
        A a = new A();

        // 인스턴스 멤버 클래스 객체 생성
        A.B b = a.new B();
        b.field = 3;
        b.method1();

        // 정적 멤버 클래스 객체 생성
        A.C c = new A.C();
        c.field1 = 3;
        c.method1();
        A.C.field2 = 3; // 정적 멤버는 이렇게 사용
        A.C.method2();

        // 로컬 클래스 객체 생성을 위한 메소드 호출
        a.method2();
    }
}
