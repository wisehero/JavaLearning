package ch11.StringClass;

// indexOf(String str)은 문자열이 포함되어 있는 경우 그 문자열이 시작하는 위치를 리턴
// 문자열이 포함되어있지 않은 경우에는 -1 리턴

public class StringIndexOfExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);

        if(subject.indexOf("자바") != -1) {
            System.out.println("자바와 관련된 책");
        } else {
            System.out.println("자바와 관련없는 책");
        }
    }
}
