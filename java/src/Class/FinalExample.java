package Class;

public class FinalExample {

	public static void main(String[] args) {

		// 객체 생성 시 주민등록번호와 이름 전달
		Final k1 = new Final( "1234-1234" , "홍길동");

		// 필드값 읽기
		System.out.println( k1.nation );
		System.out.println( k1.ssn );
		System.out.println( k1.name );

		/* Final 필드는 값을 변경할 수 없음
		 * k1.nation = "Usa";
		 * k1.ssn = "1111-1111";
		*/

		// 인스턴스 필드는 값 변경 가능
		k1.name = "임꺽정";
		System.out.println( k1.name );

	}

}
