package inheritance.FieldPolymorphis;

public class KumhoTire extends Tire {

	// 메소드 재정의 ( 오버라이딩 )
	@Override
	public void roll() {
		System.out.println( "금호 회전" );
	}

}
