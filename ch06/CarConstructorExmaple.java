package ch06;

public class CarConstructorExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//생성자 선
		CarConstructor car1 = new CarConstructor();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		CarConstructor car2 = new CarConstructor("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		CarConstructor car3 = new CarConstructor("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car.model : " + car3.model);
		System.out.println("car.color : " +car3.color);
		System.out.println();
		
		CarConstructor car4 = new CarConstructor("택시", "검정", 200);
			System.out.println("car4.company : " + car4.company);
			System.out.println("car4.model : " + car4.model);
			System.out.println("car4.color : " + car4.color);
			System.out.println("car4.maxSpeed : " +car4.maxSpeed);
			
	

	}

}
