package Interface.parameterpolymorphism;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println( "버스가 달림" );
	}

}
