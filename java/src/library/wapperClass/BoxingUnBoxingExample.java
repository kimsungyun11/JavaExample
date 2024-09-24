package library.wapperClass;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		
		// Boxing
		Integer obj = 100;
		// intValue() 메소드는 Integer 객체 내부의 int 값을 리턴
		System.out.println( "obj : " + obj.intValue() );
		
		// unboxing
		int value = obj;
		System.out.println( "value : " + value );
		
		// 연산시 unboxing
		int result = obj + 100;
		System.out.println( "result : " + result );

	}

}
