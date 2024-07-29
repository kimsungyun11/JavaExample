package inheritance;

public class PromitionChildren extends PromotionParent {

	// 메소드 오버라이딩
	@Override
	public void method2() {
		System.out.println( "자식 메소드2" );
	}
	
	// 메소드 선언
	public void method3() {
		System.out.println( "자식 메소드3" );
	}
	
	
}
