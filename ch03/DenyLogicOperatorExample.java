package ch03;

public class DenyLogicOperatorExample {
	
	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play; //부정연산자 
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
	}

}
