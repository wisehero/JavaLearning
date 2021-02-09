package JavaStandard.ch07;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine)
            System.out.println("this is instance of FireEngine");
        if(fe instanceof Car)
            System.out.println("this is instance of Car");
        if (fe instanceof Object)
            System.out.println("this is instance of Object");
        System.out.println(fe.getClass().getName());
    }
}

class Car{}
class FireEngine extends Car {}
