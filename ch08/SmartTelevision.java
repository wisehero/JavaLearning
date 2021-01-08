package ch08;

public class SmartTelevision implements Searchable, RemoteControl {

    private int volume;

    public void turnOn(){
        System.out.println("TV를  켭니다.");
    }

    public void turnOff(){
        System.out.println("TV를 끕니다.");
    }

    public void setVolume(int volume){
        if(volume > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        }else if(volume < MIN_VOLUME){
            this.volume = MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 TV볼륨: " + this.volume);
    }

    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }

}