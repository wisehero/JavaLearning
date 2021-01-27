package ch11.ClassClass;

// 프로그램에서 Class 객체를 얻기 위한 방법

import ch06.Car;

public class ClassExample {
    public static void main(String[] args) throws Exception {
        // 첫 번째 방법
        Class clazz = Car.class; // 여기서 Class 객체를 얻어옴.

        // 두 번째 방법
        // Class clazz = Class.forName("ch06.Car");

        // 세 번째 방법
        // Car car = new Car();
        // Class clazz = car.getClass();

        System.out.println(clazz.getName()); // 패키지와 클래스이름
        System.out.println(clazz.getSimpleName()); // 클래스 이름만
        System.out.println(clazz.getPackage().getName()); // 패키지 이름만

    }
}
