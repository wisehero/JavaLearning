package JavaStandard.ch09.ObjectHashCode;

// Object 클래스의 hashcode() 메서드에 대해 알아본다.

public class HashCodeEx1 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

    }
}
