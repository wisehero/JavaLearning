package JavaStandard.ch09.String;

public class StringEx3 {
    public static void main(String[] args) {
        char[] cArr = new char[0];
        String s = new String(cArr); // String s = new String("")와 같다.

        System.out.println("cArr.length=" + cArr.length);
        System.out.println("@@@"+s+"@@@");
    }
}
