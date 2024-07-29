package array;

public class MutidimensionalArray {

	public static void main(String[] args) {

		// 2차원 배열 생성
		int[][] scores = {
			{ 80, 90, 96 },
			{ 76, 88 }
		};

		// 배열의 길이
		System.out.println( "1차원" + scores.length );
		System.out.println( "2차원배열 1 : " + scores[0].length );
		System.out.println( "2차원배열 2 : " + scores[1].length );

		// 첫 번째 반의 세 번째 학생의 점수 읽기
		System.out.println( "scores[0][2] : " + scores[0][2] );

		// 두 번째 반의 두 번째 학생의 점수 읽기
		System.out.println( "scores[1][1] : " + scores[1][1] );

		// 첫 번째 반의 평균 점수 구하기
		int class1 = 0;
		for ( int i = 0; i < scores[0].length; i++ ) {
			class1 += scores[0][i];
		}
		double class1Avg = (double) class1 / scores[0].length;
		System.out.println( "1 평균 : " + class1Avg );

		// 전체 학생의 평균 점수 구하기
		int totalStd = 0;
		int totalSum = 0;

		for (int[] score : scores) {
			totalStd += score.length;
			for ( int k = 0; k < score.length; k++ ) {
				totalSum += score[k];
			}
		}

		double totalAvg = (double) totalSum / totalStd;
		System.out.println( "전체 평균 : " + totalAvg );


	}

}
