package Class;

public class KoreanExample {

	public static void main(String[] args) {

		// korean 객체 생성
		Korean k1 = new Korean("홍길동", "8888888-8888888");

		// korean 객체 데이터 읽기
		System.out.println("k1.nation : " + k1.nation );
		System.out.println("k1.name : " + k1.name );
		System.out.println("k1.ssn : " + k1.ssn );
		System.out.println();

		// 또 다른 korean 객체 생성
		Korean k2 = new Korean("임꺽정", "22222-22222");

		// 또 다른 korean 객체 데이터 읽기
		System.out.println("k2.nation : " + k2.nation );
		System.out.println("k2.name : " + k2.name );
		System.out.println("k2.ssn : " + k2.ssn );

	}

}
