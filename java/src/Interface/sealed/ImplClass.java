package Interface.sealed;

public class ImplClass implements InterfaceC {

	@Override
	public void methodB() {
		System.out.println( "b실행" );
	}

	@Override
	public void methodA() {
		System.out.println( "a실행" );
	}

	@Override
	public void methodC() {
		System.out.println( "c실행" );
	}
	
}
