package inheritance.abstractClass;

// 추상 클래스 선언
public abstract class Phone {
	
	// 필드 선언
	String owner;
	
	// 생성자 선언
	Phone ( String owner ) {
		this.owner = owner;
	}
	
	// 메소드 선언
	void turnOn() {
		System.out.println( "폰 전원 켬" );
	}
	
	void turnOff() {
		System.out.println( "폰 전원 끔" );
	}

}
