package inheritance.sealed;

// non-sealed한테 상속
public class Director extends Manager {
	
	@Override
	public void work() {
		System.out.println( "제품 기획" );
	}

}
