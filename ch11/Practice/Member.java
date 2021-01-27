package ch11.Practice;

// Member 클래스를 작성하되, Object의 toString() 메소드를 재정의해서 Member Example 클래스의 실행결과처럼 나오도록 작성해보세요.

public class Member {
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return  id + ": " + name;
    }
}
