package library.stringBuelderClass;

public class StringBuilderExample {

	public static void main(String[] args) {
		// 메소드 체이닝 패턴
		String data = new StringBuilder()
				.append("def") // 문자열 끝에 추가
				.insert(0, "abc") // 문자열 지정 위치에 추가
				.delete(3, 4) // 문자열 일부 삭제
				.toString(); // 완성된 문자열 리턴
		System.out.println( data );
	}

}
