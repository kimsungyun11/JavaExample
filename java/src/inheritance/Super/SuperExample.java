package inheritance.Super;

public class SuperExample {

	public static void main( String[] arg ) {
		
		ChildrenSuper sa = new ChildrenSuper();
		
		sa.takeOff();
		sa.fly();
		sa.flymode = ChildrenSuper.SUPERSONIC;
		sa.fly();
		sa.flymode = ChildrenSuper.NORMAL;
		sa.fly();
		sa.land();
		
	}
}
