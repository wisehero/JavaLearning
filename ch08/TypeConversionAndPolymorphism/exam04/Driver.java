package ch08.TypeConversionAndPolymorphism.exam04;

import ch08.TypeConversionAndPolymorphism.exam03.Bus;
import ch08.TypeConversionAndPolymorphism.exam03.Vehicle;


public class Driver {
    public void drive(Vehicle vehicle) { // vehicle에는 Bus와 Taxi 둘다 들어갈 수 있다.
        if(vehicle instanceof Bus) { // vehicle이 매개 변수가 참조하는 객체가 Bus인지 조사
            Bus bus = (Bus) vehicle; // Bus 객체일 경우 안전하게 강제 타입 변환
            bus.checkFare();
        }
        vehicle.run();
    }
}
