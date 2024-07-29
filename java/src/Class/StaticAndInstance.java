package Class;

public class StaticAndInstance {
	// 정적 멤버
	private static int staticVar = 10;
	// 인스턴스 멤버
	private int instanceVar = 20;

	// 정적 멤버
	public static void staticMethod() {
		// System.out.println( instanceVar ); // 컴파일 에러
		// instanceMethod(); // 컴파일 에러
		// 정적 멤버 사용
		System.out.println("staticVar : " + staticVar);

		// 인스턴스 멤버 사용
		StaticAndInstance obj = new StaticAndInstance();
		System.out.println("Instance var : " + obj.instanceVar);
		obj.instanceMethod();
	}

	// 인스턴스 멤버
	public void instanceMethod() {
		// 정적 멤버 사용
		System.out.println("static var : " + staticVar);
		// 인스턴스 멤버 사용
		System.out.println("Instance var : " + instanceVar);
		// 정적 메소드 호출 가능
		staticMethod();
	}

	// 정적 멤버
	public static void main(String[] args) {
		// 정적 멤버 사용
		staticMethod();

		// 인스턴스 멤버 사용
		StaticAndInstance obj = new StaticAndInstance();
		obj.instanceMethod();
	}
}
