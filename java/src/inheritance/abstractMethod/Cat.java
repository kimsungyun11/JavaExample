package inheritance.abstractMethod;

public class Cat extends Animal {
	
	// 추상 메소드 재정의
	@Override
	public void sound() {
		System.out.println( "미야옹" );
	}
	
}
