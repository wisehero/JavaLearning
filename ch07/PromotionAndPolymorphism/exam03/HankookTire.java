package ch07.PromotionAndPolymorphism.exam03;

public class HankookTire extends Tire {
    // 필드
    // 생성자
    public HankookTire(String location, int maxRotation) {
        super(location, maxRotation); // Tire가 매개변수를 갖는 생성자가 명시되어 있기 때문에 써줘야한다.
    }

    // 메소드
    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + " HankookTire 수명: " + (maxRotation - accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " HankookTire 펑크 ***");
            return false;
        }
    }
}
