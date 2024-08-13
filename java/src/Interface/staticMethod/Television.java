package Interface.staticMethod;

public class Television implements RemoteControl {

	// 필드
	private int volume;

	// turnOn() 추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("tv를 켬");
	}

	// turnOff() 추상 메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("tv를 끔");
	}

	// setVolume() 추상 메소드 오버라이딩
	// 인터페이스 상수 필드를 이용해서 volume 필드의 값을 제한
	@Override
	public void setVolume( int volume ) {
		if ( volume > RemoteControl.MAX_VOLUME ) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if ( volume < RemoteControl.MIN_VOLUME ) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println( "tv볼륨 : " + this.volume );
	}

}
