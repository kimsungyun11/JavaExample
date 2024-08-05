package inheritance.sealed;

// 상속 가능 ( non-sealed )
public non-sealed class Manager extends Person {
	
	@Override
	public void work() {
		System.out.println( "생산 관리" );
	}

}
