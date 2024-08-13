package Interface.multiInterface;

public class SmartTelevision implements RemoteControl, Searchable {

	@Override
	public void search(String url) {
		System.out.println( url + " 을 검색함" );
	}

	@Override
	public void turnOn() {
		System.out.println( "tv켬" );
	}

	@Override
	public void turnOff() {
		System.out.println( "tv를 켬" );
	}

}
