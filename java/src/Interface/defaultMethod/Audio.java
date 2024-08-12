package Interface.defaultMethod;

public class Audio implements RemoteControl {

	// 필드
	private int volume;

	// turnOn() 추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("audio를 켬");
	}

	// turnOff() 추상 메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("audio를 끔");
	}

	// setVolume() 추상 메소드 오버라이딩
	// 인터페이스 상수 필드를 이용해서 volume 필드의 값을 제한
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("audio볼륨 : " + this.volume);
	}
	
	// 추가 필드
	private int memoryVolume;
	
	// 디폴트 메소드 재정의
	@Override
	public void setMute ( boolean mute ) {
		if ( mute ) {
			this.memoryVolume = this.volume;
			System.out.println( "무음" );
			setVolume( RemoteControl.MIN_VOLUME );
		} else {
			System.out.println( "해제" );
			setVolume( this.memoryVolume );
		}
	}

}
