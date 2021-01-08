package ch07;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//car객체 생
		Car car = new Car();
		
		//car객체의 run()메소드 5번 반복실
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽",15);
				break;
			case 2:
				System.out.println("앞 오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 15);
				break;
			case 3:
				System.out.println("뒤 왼쪽  KumhoTire로 교체");
				car.backLeftTire = new KumhoTire("뒤왼쪽", 13);
				break;
			case 4:
				System.out.println("뒤 오른쪽  KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 14);
				break;
			}
			System.out.println("---------------------------------");
		}

	}

}
