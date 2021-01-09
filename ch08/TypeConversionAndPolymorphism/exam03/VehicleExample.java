package ch08.TypeConversionAndPolymorphism.exam03;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus(); // Bus는 Vehicle의 구현 객체

        vehicle.run();
        // vehicle.checkFare(); 컴파일 에러

        Bus bus = (Bus)vehicle; // 강제 타입 변환
        bus.run();
        bus.checkFare();

    }
}
