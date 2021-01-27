package ch11.WrapperClass;

// 자동 박싱은 포장 클래스 타입에 기본값이 대입될 경우에 발생한다.
// 예를 들어 Int 타입의 값을 Integer 클래스 변수에 대입하면 자동 박싱이 일어나 힙 영역에 Integer 객체가 생성된다.
// 자동 언박싱은 기본 타입에 포장 객체가 대입되는 경우와 연산에서 발생한다.

public class AutoBoxingUnboxingExample {
    public static void main(String[] args) {
        // 자동 박싱
        Integer obj = 100;
        System.out.println("value: " + obj.intValue());

        // 대입 시 자동 언박싱
        int value = obj;
        System.out.println("value: " + value);

        // 연산 시 자동 언박싱
        int result = obj + 100;
        System.out.println("result: " + result);

    }
}
