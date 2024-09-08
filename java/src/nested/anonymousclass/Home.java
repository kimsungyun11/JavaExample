package nested.anonymousclass;

public class Home {
	
	// 필드에 익명 구현 객체 대입
	private RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println( "tv 켬" );
			
		}
		
		@Override
		public void turnOff() {
			System.out.println( "tv 끔" );
		}
	};
	
	// 메소드 ( 필드 이용 )
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	// 메소드 ( 로컬 변수 이용 )
	public void use2() {
		// 로컬 변수에 익명 구현 객체 대입
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println( "에어컨 켬" );
			}
			
			@Override
			public void turnOff() {
				System.out.println( "에어컨 끔" );
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
	
	// 메소드 ( 매개변수 이용 )
	public void use3( RemoteControl rc ) {
		rc.turnOn();
		rc.turnOff();
	}

}
