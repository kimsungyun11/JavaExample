package nested.anonymous;

public class Car {
	
	// 필드에 Tire 객체 대입
	private Tire tire1 = new Tire();
	
	// 필드에 익명 자식 객체 대입
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println( "익명 자식 tire 객체 1이 굴러감" );
		}
	};
	
	// 메소드 ( 필드 이용 )
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	// 메소드 ( 로컬 변수 이용 )
	public void run2() {
		
		// 로컬 변수에 익명 자식 객체 대입
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println( "익명 자식 ture 객체 2가 굴러감" );
			}
		};
		tire.roll();
	}
	
	// 메소드 ( 매개변수 이용 )
	public void run3( Tire tire ) {
		tire.roll();
	}
	
}
