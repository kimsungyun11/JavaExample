package array;

public class MutidimensionalArray2 {

	public static void main(String[] args) {
		
		// 각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열 생성
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		// 배열의 항목 초기값 출력
		for ( int i = 0; i < englishScores.length; i++ ) { // 반의 수 만큼 반복
			for ( int k = 0; k < englishScores[i].length; k++ ) { // 해당 반의 수 만큼 반복
				System.out.println( "englishScores[" + i + "][" + k + "] " + englishScores[i][k] );
			}
		}
		System.out.println();
		
		// 배열 항목 값 변경
		englishScores[0][0] = 90;		
		englishScores[0][1] = 91;		
		englishScores[1][0] = 92;		
		englishScores[1][1] = 93;		
		englishScores[1][2] = 94;
		
		// 전체 학생의 영어 평균 구하기
		int totalStudent = 0;
		int totalEnglishSum = 0;
		
		for ( int i = 0; i < englishScores.length; i++ ) {
			totalStudent += englishScores[i].length;
			for ( int k = 0; k < englishScores[i].length; k++ ) {
				totalEnglishSum += englishScores[i][k];
			}
		}
		
		double totalEngAvg = ( double ) totalEnglishSum / totalStudent;
		
		System.out.println( "영어 평균 : " + totalEngAvg );
		
 
	}

}
