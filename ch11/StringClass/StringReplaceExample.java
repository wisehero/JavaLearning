package ch11.StringClass;

// replace(str1, str2) 는 str1을 str2로 바꾼다.

public class StringReplaceExample {
    public static void main(String[] args) {
        String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
        String newStr = oldStr.replace("자바", "JAVA");
        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
