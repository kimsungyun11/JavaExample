package Interface.implementsClass;

public class Television implements RemoteController {
	
	@Override
	public void turnOn() {
		System.out.println( "tv를 켬" );
	}
}
