package ch07.exam03;

public class CoumputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원면적: " + calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원면적: " + computer.areaCircle(r)); // 재정의한 메소드를 호출
    }
}

/*
 자식 클래스에 부모 클래스의 메소드를 재정의하게 되면, 부모 클래스의 메소드는 숨겨지고 재정의된 자식 메소드만 사용됩니다.
 그러나 자식 클래스 내부에서 재정의된 부모 클래스를 호출해야 하는 상황이 발생한다면 super 키워드를 붙여서 부모 메소드를 호출할 수 있습니다.

 super.부모 메소드();
 */
