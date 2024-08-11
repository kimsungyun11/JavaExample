package Interface.implementsClass;

public class Audio implements RemoteController {

	@Override
	public void turnOn() {
		System.out.println( "audio를 켬" );
	}

}
