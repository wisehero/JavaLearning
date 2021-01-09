package ch08.Interface.exam06;

import ch08.Interface.exam04.Audio;
import ch08.Interface.exam04.Television;

public class MyClassExample {
    public static void main(String[] args) {
        System.out.println("1)-------------------------");

        MyClass myClass1 = new MyClass(); // MyClass 객체를 생성해서
        myClass1.rc.turnOn(); // MyClass 객체의 필드를 사용 후 메소드 호출
        myClass1.rc.setVolume(5);

        System.out.println("2)-------------------------");

        MyClass myClass2 = new MyClass(new Audio());

        System.out.println("3)-------------------------");

        MyClass myClass3 = new MyClass();
        myClass3.methodA();

        System.out.println("4)-------------------------");
        MyClass myClass4 = new MyClass();
        myClass4.methodB(new Television());

    }
}
