package ch08.Interface.exam06;

import ch08.Interface.exam03.RemoteControl;
import ch08.Interface.exam04.Audio;
import ch08.Interface.exam04.Television;

public class MyClass {
    // 필드
    RemoteControl rc = new Television();

    // 생성자
    MyClass(){}

    MyClass(RemoteControl rc) {
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }

    // 메소드
    void methodA() {
        // 로컬 변수
        RemoteControl rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
    }
    void methodB(RemoteControl rc) {
        // 메소드의 매개 타입
        rc.turnOn();
        rc.setVolume(5);
    }
}
