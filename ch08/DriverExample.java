package ch08;

public class DriverExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        // vehicle.checkFare() 사용불가

        Bus bus = (Bus) vehicle;

        bus.run();
        bus.checkFare();
    }
}
