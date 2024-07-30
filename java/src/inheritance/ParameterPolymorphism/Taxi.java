package inheritance.ParameterPolymorphism;

public class Taxi extends Vehicle {

	// 메소드 재정의 ( 오버라이딩 )
	@Override
	public void run() {
		System.out.println( "택시가 달림" );
	}
	
}
