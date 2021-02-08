package JavaStandard.ch07.exam23;

import java.util.Vector;

public class PolyArgumentTest3 {
    public static void main(String[] args) {
            Buyer b = new Buyer();
            Tv tv = new Tv();
            Computer com = new Computer();
            Audio audio = new Audio();

            b.buy(tv);
            b.buy(com);
            b.buy(audio);
            b.summary();
            System.out.println();
            b.refund(com);
            b.summary();
    }
}

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

    Product() {
        price = 0;
        bonusPoint = 0;
    }
}

class Tv extends Product {
    Tv() {
        // 조상 클래스의 생성자 Product(int price) 호출
        super(100);
    }
    // Object클래스의 toString()을 오버라이딩
    public String toString() {return "Tv";}
}

class Computer extends Product {
    Computer() {
        super(200);
    }
    public String toString() {return "Computer";}
}

class Audio extends Product {
    Audio() {
        super(50);
    }
    public String toString() {
        return "Audio";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector(); // 구입한 제품을 저장하는데 사용될 Vector객체

    void buy (Product p) {
        if(money < p.price) {
            System.out.println("잔액부족");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);        // 구입한 제품을 Vector에 추가
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void refund(Product p) {
        if(item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을/를 반품하셨습니다.");
        } else {
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary () { // 구매 물품에 대한 정보를 요약해서 보여준다.
        int sum = 0;  // 구입한 물품의 가격 합계
        String itemList = ""; // 구입한 물품 목록
        if(item.isEmpty()) { // vector가 비어있는 지 확인
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }
        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for(int i = 0; i < item.size(); i++){
            Product p = (Product)item.get(i); // 벡터의 i번째 객체를 얻어옴
            sum += p.price;
            itemList += (i==0) ? "" + p : ", " + p;
        }

        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다." );
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}
