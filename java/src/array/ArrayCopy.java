package array;

public class ArrayCopy {

	public static void main(String[] args) {

		// 길이가 3인 배열 생성
		String[] oldArray = { "java", "array", "copy" };

		// 길이가 5인 배열을 새로 생성
		String[] newArray = new String[5];

		// 배열 항목 복사
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);

		// 배열 항목 출력
		for (String element : newArray) {
			System.out.println( element + ", " );
		}

	}

}
