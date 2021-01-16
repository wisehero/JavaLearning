package ch09.nestedClassAndNestedInterface.exam01;

// 바깥 클래스
public class A {
    A() { System.out.println("A 객체가 생성됨");}

    // 인스턴스 멤버 클래스
    class B {
        B(){System.out.println("B 객체가 생성됨");}
        int field;
        // static int filed;  컴파일 에러
        void method1(){}
        // static void method2() 컴파일 에러
    }

    // 정적 멤버 클래스
    static class C {
        C() {System.out.println("C 객체가 생성됨");}
        int field1;
        static int field2;
        void method1(){}
        static void method2(){}
    }

    void method2() {
        // 로컬 클래스
        class D {
            D() {System.out.println("D 객체가 생성됨");}
            int field1;
            // static int field2; 컴파일 에러
            void method1(){}
            // static void method2() 컴파일 에러

        }
        D d = new D(); // 메소드 내부에서 객체 생성 후 사용
        d.field1 = 3;
        d.method1();
    }
}
