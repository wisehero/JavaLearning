package ch06;

public class CarReturnExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarReturn myCar = new CarReturn();
		
		myCar.setGas(5); //setGas 호출
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run(); 
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("가스를 주입할 필요가 없습니다.");
		}else {
			System.out.println("가스를 주입하세요.");
		}

	}

}
