package Interface.defaultMethod;

public interface RemoteControl {
	// 상수 선언
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메소드 ( 메소드 선언부만 작성 )
	void turnOn();
	void turnOff();
	void setVolume( int volume );
	
	// 디폴트 인스턴스 메소드
	default void setMute ( boolean mute ) {
		if ( mute ) {
			System.out.println( "무음" );
			
			// 추상 메소드 호출하면서 상수 필드 사용
			setVolume(MIN_VOLUME);
		} else {
			System.out.println( "해제" );
		}
	}
}
