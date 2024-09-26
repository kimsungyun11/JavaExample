package library.anotationExample;

public class Service {
	@PrintAnnotation
	public void method1() {
		System.out.println( "1번" );
	}
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.println( "2번" );
	}
	
	@PrintAnnotation( value = "#", number = 20 )
	public void method3() {
		System.out.println( "3번" );
	}
}
