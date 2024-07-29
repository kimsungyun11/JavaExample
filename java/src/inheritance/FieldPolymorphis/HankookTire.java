package inheritance.FieldPolymorphis;

public class HankookTire extends KumhoTire {

	// 메소드 재정의 ( 오버라이딩 )
	@Override
	public void roll() {
		System.out.println( "한국 회전" );
	}
	
}
