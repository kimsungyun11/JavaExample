package inheritance.sealed;

// 상속 불가능 ( final 클래스 )
public final class Employee extends Person {
	
	// 오버라이딩 ( 상속 받은 부모 메소드 말고 자식의 메소드를 쓰게 하는 것 )
	@Override
	public void work() {
		System.out.println( "제품을 생산" );
	}

}
