package inheritance.sealed;

// 봉인된 클래스
public sealed class Person permits Employee, Manager {
	
	// 필드
	public String name;
	
	// 메소드
	public void work() {
		System.out.println( "하는 일 없음" );
	}

}
