package inheritance;

public class InheritanceExample {

	public static void main(String[] args) {

		// children 객체 생성
		Children myPhone = new Children("갤럭시", "은색");

		// 상속 받은 필드 읽기
		System.out.println( "모델 : " + myPhone.model );
		System.out.println( "색상 : " + myPhone.color );

		// children의 필드 읽기
		System.out.println( "와이파이 상태 : " + myPhone.wifi );

		// 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice( "여" );
		myPhone.receiveVoice( "홍길동입니다" );
		myPhone.sendVoice( "네, 반갑" );
		myPhone.hengUp();

		// children의 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();

	}

}
