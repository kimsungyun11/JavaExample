package Interface.casting;

public class Bus implements Vehicle {
	
	// 추상 메소드 재정의
	@Override
	public void run() {
		System.out.println( "버스가 달림" );
	}
	
	// 추가 메소드
	public void checkFare() {
		System.out.println( "요금 체크" );
	}
	
}
