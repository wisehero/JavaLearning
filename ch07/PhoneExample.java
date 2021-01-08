package ch07;

public class PhoneExample {

	public static void main(String[] args) {
		
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("김지웅");
		
		smartPhone.turnOn(); // phone의 메소드 
		smartPhone.internetSearch();
		smartPhone.turnOff();// phone의 메소드 

	}

}
