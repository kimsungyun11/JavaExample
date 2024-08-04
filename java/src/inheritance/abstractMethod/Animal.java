package inheritance.abstractMethod;

// 추상 클래스
public abstract class Animal {
	
	// 메소드 선언
	public void breathe() {
		System.out.println( "숨을 쉼" );
	}
	
	// 추상 메소드 선언
	public abstract void sound();
	
}
