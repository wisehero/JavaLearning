package ch11.StringClass;

// 문자열의 길이는 lenght(String str)로 알 수 있다. 이 경우 공백을 포함하여 결과값을 리턴한다.

public class StringLengthExample {
    public static void main(String[] args) {
        String ssn = "7306241230123";
        int length = ssn.length();
        if(length == 13) {
            System.out.println("주민번호 자리수가 맞습니다.");
        } else {
            System.out.println("주민번호 자리수가 틀립니다.");
        }
    }
}
