package ch11.WrapperClass;

// 포장 객체는 내부의 값을 비교하기 위해 ==나 !=를 쓰지 않는 것이 좋다.
// 포장 객체역시 객체이기 때문에 내부의 값이 아닌 번지를 비교하기 때문이다.
// 따라서 언박싱을해서 비교하거나 equals를 써서 비교해야 한다.

public class ValueCompareExample {
    public static void main(String[] args) {
        System.out.println("[-128~127 초과값일 경우]");
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("==결과: " + (obj1 == obj2));
        System.out.println("언박싱후 == 결과: " + (obj1.intValue() == obj2.intValue()));
        System.out.println("equals() 결과: " + (obj1.equals(obj2)));
        System.out.println();

        System.out.println("[-128~127 범위값일 경우]");
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println("==결과: " + (obj3 == obj4));
        System.out.println("언박싱후 ==결과: " + (obj3.intValue() == obj4.intValue()));
        System.out.println("equals() 결과: " + obj3.equals(obj4));



    }
}
