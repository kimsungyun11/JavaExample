package inheritance;

public class Parent {

	// 필드 선언
	public String model;
	public String color;

	// 기본 생성자 선언
	public Parent() {
		System.out.println("부모 생성자");
	}

	// 메소드 선언
	public void bell() {
		System.out.println( "벨 울림" );
	}

	public void sendVoice( String message ) {
		System.out.println( "나 : " + message );
	}

	public void receiveVoice( String message ) {
		System.out.println( "너 : " + message );
	}

	public void hengUp() {
		System.out.println( "전화 끝" );
	}

}
