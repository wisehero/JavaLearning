package ch08.Interface.exam04;

import ch08.Interface.exam03.RemoteControl;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc = new Audio();
    }
}
