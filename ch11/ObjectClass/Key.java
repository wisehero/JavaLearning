package ch11.ObjectClass;

// equals 메소드를 재정희해서 number의 필드값이 같으면 true 리턴
// hashcode()는 재정의 하지 않았기 떄문에 Object의 hashcode()가 필요

public class Key {
    public int number;

    public Key(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Key){
            Key compareKey = (Key) obj;
            if(this.number == compareKey.number) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return number;
    }
}
