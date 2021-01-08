package ch07.exam02;

public class People {
    public String name;
    public String ssn;

    // People을 상속 받는 경우에는 아래의 생성자를 명시적으로 호출해줘야 한다. 이 클래스에는 기본 생성자가 없기 때문이다.
    public People(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}
