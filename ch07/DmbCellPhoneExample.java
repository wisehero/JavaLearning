package ch07;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체 생
		DmbCellPhone dmbCellPhone = new DmbCellPhone("갤럭시", "검정", 10);
		
		//CellPhone 클래스로부터 상속받은 필드
		
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		
		//DmbCellPhone 클래스의 필드
		System.out.println("채널: " + dmbCellPhone.channel);
		
		//CellPhone 클래스로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receivceVoice("안녕하세요! 저는 김지웅인데요");
		dmbCellPhone.sendVoice("ㅎㅇ");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone 클래스의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
