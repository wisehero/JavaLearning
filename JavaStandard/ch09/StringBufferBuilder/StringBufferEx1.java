package JavaStandard.ch09.StringBufferBuilder;

public class StringBufferEx1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println("sb == sb2 ? " + (sb == sb2)); // false
        System.out.println("sb.equals(sb2) ? " + sb.equals(sb2)); // false StringBuffer에는 equals가 String에서처럼 오버라이딩 되어 있지 않음

        String s = sb.toString();
        String s2 = sb2.toString();

        System.out.println("s.equals(s2) ? " + s.equals(s2));
    }
}
