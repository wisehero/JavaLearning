package ch06;

public class CarConstructor {

	
		
		String company = "현대자동차";
		String model;
		String color;
		int maxSpeed;
		
		//생성자
		CarConstructor(){
		}
		
		CarConstructor(String model){
			this.model = model;
		}
		
		CarConstructor(String model, String color){
			this.model = model;
			this.color = color;
		}
		
		CarConstructor(String model, String color, int maxSpeed){
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
		
	

}
