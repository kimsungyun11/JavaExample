package library.mathClass;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		
		// 선택번호
		// 선택번호 6개가 저장될 배열 생성
		int[] selectNumber = new int[6];
		
		// 선택번호를 얻기 위한 Random 객체 생성
		Random random = new Random();
		System.out.print( "선택번호 : " );
		
		// 선택번호 6개를 얻어 배열에 저장
		for ( int i = 0; i < 6; i++ ) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.println( selectNumber[i] + " " );
		}
		System.out.println();
		
		// 당첨 번호
		// 당첨번호 6개가 저장될 배열 생성
		int[] winningNumber = new int[6];
		
		// 당첨번호를 얻기 위한 Random 객체 생성
		random = new Random(5);
		System.out.print( "당첨번호 : " );
		
		// 당첨번호 6개를 얻어 배열에 저장
		for ( int i = 0; i < 6; i++ ) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.println( winningNumber[i] + " " );
		}
		System.out.println();
		
		// 당첨 여부
		// 비교하기 전에 배열 항목을 정렬시킴
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		
		// 배열 항목 비교
		boolean result = Arrays.equals(selectNumber, winningNumber);
		
		System.out.print( "당첨 여부 : " );
		
		if ( result ) {
			System.out.println( "1등 당첨" );
		}else { 
			System.out.println( "당첨 x" );
		}

	}

}
