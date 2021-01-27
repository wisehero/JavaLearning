package ch11.SystemClass;

// Exit() 메소드

public class ExitExample {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if(i==5) {
                System.exit(0);
                // break;
            }
        }
        System.out.println("마무리 코드"); // 이 라인은 실행이 되지 않는다.
    }
}
