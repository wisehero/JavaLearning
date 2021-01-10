package ch08.TypeConversionAndPolymorphism.exam05;

public class Example {
    public static void main(String[] args) {
        ImplementationC impl = new ImplementationC() ;

        InterfaceA ia = impl;
        ia.methodA(); // 이것만 호출 가능
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB(); // 이것만 호출 가능
        System.out.println();

        InterfaceC ic = impl;
        // InterfaceA와 InterfaceB를 상속하는 InterfaceC로 타입을 변환하면 모두 호출 가능
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
