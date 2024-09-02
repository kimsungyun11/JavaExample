package nested.localClass;

public class A {

	// 메소드
	void useB() {

		// 로컬 클래스
		class B {

			// 인스턴스 필드
			int fileld1 = 1;

			// 정적 필드
			static int field2 = 2;

			// 생성자
			B() {
				System.out.println("b 생성자 실행");
			}

			// 인스턴스 메소드
			void method1() {
				System.out.println("b 메소드 실행");
			}

			// 정적 메소드
			static void method2() {
				System.out.println("b 메소드 실행");
			}

		}

		// 로컬 객체 생성
		B b = new B();

		// 로컬 객체의 인스턴스 필드와 메소드 사용
		System.out.println( b.fileld1 );
		b.method1();
		
		// 로컬 클래스의 정적 필드와 메소드 사용
		System.out.println( B.field2 );
		B.method2();
		
	}

}
