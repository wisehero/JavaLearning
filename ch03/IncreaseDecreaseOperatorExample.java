package ch03;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("----------------");
		x++;
		++x; //11을 전달함과 동시에 12로 값 변
		System.out.println("x=" + x); //결과값 12
		
		System.out.println("----------------");
		y--; 
		--y;
		System.out.println("y=" + y);
		
		System.out.println("----------------");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("----------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("z=" + x);
		
		System.out.println("----------------");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		

	}

}
