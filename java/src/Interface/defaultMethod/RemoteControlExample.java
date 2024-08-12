package Interface.defaultMethod;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;

		// rc 변수에 Television 객체를 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);

		// 디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();

		// Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		
		// 디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);

	}

}
