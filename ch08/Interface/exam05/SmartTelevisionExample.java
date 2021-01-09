package ch08.Interface.exam05;

import ch08.Interface.exam03.RemoteControl;

public class SmartTelevisionExample {
    public static void main(String[] args) {
        SmartTelevision tv = new SmartTelevision();

        RemoteControl rc = tv;
        Searchable searchable = tv;
        /*
        SmartTelevision은 위 두 개의 인터페이스를 구현하고 있으므로
        두 인터페이스의 타입 변수에 대입할 수 있다.
         */


    }
}
