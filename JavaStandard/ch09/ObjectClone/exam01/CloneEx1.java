package JavaStandard.ch09.ObjectClone.exam01;

public class CloneEx1 {
    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = (Point) original.clone(); // 새로운 객체 생성
        System.out.println(original);
        System.out.println(copy);
    }
}

class Point implements Cloneable { // Cloneable 인터페이스를 구현한 클래스에서만 clone()을 호출할 수 있다. 그렇지 않으면 예외 발생
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x=" + x + ", y=" + y;
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone(); // Clone은 반드시 예외처리를 해줘야한다.
        } catch (CloneNotSupportedException e) {
        }
        return obj;
    }
}