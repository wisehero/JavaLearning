package ch07;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student("김지웅", "123456-1234567", 1);
		//부모에게 상속받은 필드 출
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);

	}

}
