package Class;

public class Computer {

	// 가변길이 매개변수를 갖는 메소드 선언
	int sum ( int ... values ) {

		// sum변수 선언
		int sum = 0;

		// values는 배열 타입의 변수처럼 사용
		for (int value : values) {
			sum += value;
		}

		// 합산 결과를 리턴
		return sum;

	}

}
