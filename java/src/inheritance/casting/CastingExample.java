package inheritance.casting;

// 강제 타입 변환 예시
public class CastingExample {
	public static void main ( String[] args ) {
		
		// 객체 생성 및 자동 타입 변환
		CastingParent parent = new CastingChild();
		
		// parent 타입으로 필드와 메소드 사용
		parent.field1 = "date1";
		parent.method1();
		parent.method2();
		
		/* 자식 타입 객체 및 필드 사용 불가능
		parent.field2 = "data2";
		parent.method3();
		*/
		
		// 강제 타입 변환
		CastingChild child = ( CastingChild ) parent;
		
		// child 타입으로 필드와 메소드 사용
		child.field2 = "data2";
		child.method3();
		
		child.field1 = "date3";
		child.method1();
		
	}
}
