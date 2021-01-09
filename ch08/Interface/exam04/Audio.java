package ch08.Interface.exam04;

import ch08.Interface.exam03.RemoteControl;

public class Audio implements RemoteControl {
    // 필드
    private int volume;

    // turnOn() 추상 메소드의 실체 메소드
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }
    // turnOff() 추상 메소드의 실체 메소드
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }
    // setVolume() 추상 메소드의 실체 메소드
    public void setVolume(int volume) {
        // 인터페이스의 상수를 이용해서 volume 필드의 값을 제한
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨: " + this.volume);
    }
}

/*
    구현 클래스에서 인터페이스의 추상 메소드에 대한 실체 메소드를 작성할 때
    public보다 더 낮은 접근 제한으로 작성할 수 없다.

 */
