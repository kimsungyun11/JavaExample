package array;

public class ArrayCreateByValueListExample {
	public static void main(String[] args) {
		// 배열 변수 선언과 동시에 배열 생성
		int[] scores = new int[] { 83, 90, 87 };

		// 배열 항목의 총합을 구하고 출력
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}

		System.out.println("총합 : " + sum);

		// 배열을 매개값으로 주고, printItem() 메소드 호출
		preintItem(new int[] { 83, 90, 87 });

	}

	// printItem() 메소드 선언
	private static void preintItem(int[] scores) {
		// 매개변수가 참조하는 배열의 항목을 출력
		for ( int i = 0; i < 3; i++ ) {
			System.out.println( "score[" + i + "]:" + scores[i] );
		}
	}
}