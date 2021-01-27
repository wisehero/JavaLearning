package ch11.StringClass;

public class StringSubstringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0, 6); // 0부터 6 인덱스까지 추출하여 리턴
        System.out.println(firstNum);

        String secondNum = ssn.substring(7); // 7부터 시작해서 끝까지 리턴
        System.out.println(secondNum);
    }
}
