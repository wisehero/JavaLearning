package ch07.exam04;

public class SuperSonicAirplaneExample {
    public static void main(String[] args) {
        SuperSonicAirPlane sa = new SuperSonicAirPlane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SuperSonicAirPlane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SuperSonicAirPlane.NORMAL;
        sa.fly();
        sa.land();
    }
}
