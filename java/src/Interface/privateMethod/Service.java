package Interface.privateMethod;

public interface Service {
	
	// 디폴트 메소드
	default void defaultMethod1() {
		System.out.println( "defaultMethod1 코드" );
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println( "defaultMethod2 코드" );
		defaultCommon();
	}

	// private 메소드
	private void defaultCommon() {
		System.out.println( "defaultMethod 증복 코드a" );
		System.out.println( "defaultMethod 증복 코드b" );
	}
	
	// 정적 메소드
	static void staticMethod1() {
		System.out.println( "staticMethod1 코드" );
		staticCommon();
	}
	
	static void staticMethod2() {
		System.out.println( "staticMethod2 코드" );
		staticCommon();
	}

	// private 정적 메소드
	private static void staticCommon() {
		System.out.println( "staticMethod1 중복코드c" );
		System.out.println( "staticMethod1 중복코드d" );
	}
	
}
