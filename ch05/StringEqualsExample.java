package ch05;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//같은 객체를 공유하는 String 객체 생
		String strVar1 = "김지웅";
		String strVar2 = "김지웅";
		
	   if(strVar1 == strVar2) {
		   System.out.println("strVar1과 strVar2는 참조가 같음");
	   }else {
		   System.out.println("strVar1과 strVar2는 참조가 다");
	   }
	   
	  if(strVar1.equals(strVar2)) {
		  System.out.println("strVar1과 strVar2는 문자열이 같음");
	  }
	  
	  String strVar3 = new String("김지웅");
	  String strVar4 = new String("김지웅");
	  
	 if(strVar3 == strVar4) {
		 System.out.println("strVar3과 strVar4는 참조가 같음 ");
		 
	 }else {
		 System.out.println("strVar3과 strVar4는 참조가 다름 ");
	 }
	 
	 if(strVar3.contentEquals(strVar4)) {
		 System.out.println("strVar3과 strVar4는 문자열이 같음");
	 }

	}

}
