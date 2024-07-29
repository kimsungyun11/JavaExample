package inheritance.promotion;

public class PromotionExample {
	public static void main ( String[] args ) {
		
		// 자식 객체 생성
		PromitionChildren child = new PromitionChildren();
		
		// 자동 타입 변환
		PromotionParent parent = child;
		
		// 메소드 호출
		parent.method1();
		parent.method2();
		// parent.method3(); ( 호출 불가능 )
		
		
	}
}
