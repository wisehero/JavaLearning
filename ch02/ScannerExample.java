package ch02;


import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if(inputData.equals("q")) {
				System.out.println("종료 버튼을 눌렀기 때문에 작동을 멈춥니다.");
				break;
				
			}
		}

	}

}
