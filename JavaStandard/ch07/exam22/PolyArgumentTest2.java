package JavaStandard.ch07.exam22;

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Audio());
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
    Product[] item = new Product[10];
    int i = 0; // Product 배열에 사용될 카운터

    void buy (Product p) {
        if(money < p.price) {
            System.out.println("잔액부족");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void summary () { // 구매 물품에 대한 정보를 요약해서 보여준다.
        int sum = 0;  // 구입한 물품의 가격 합계
        String itemList = ""; // 구입한 물품 목록

        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for(int i = 0; i < item.length; i++) {
            if(item[i] == null) break;
            sum += item[i].price;
            itemList += item[i] +", " ;
        }
        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다." );
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}
