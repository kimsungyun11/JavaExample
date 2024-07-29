package Enum;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {

		// Week 열거 타입 변수 선언
		Week today = null; // week타입 변수 today 선언

		// calender 얻기
		// 컴퓨터 날짜 및 시간 정보를 가진 Calendar객체를 얻고 번지를 cal 변수에 대입, Calendar 얻기
		Calendar cal = Calendar.getInstance();

		// 오늘의 요일 얻기 ( 1 ~ 7 )
		// 일(1) ~ 토 (7)까지의 숫자를 얻고, week 변수에 대입
		int week = cal.get( Calendar.DAY_OF_WEEK );

		// 숫자를 열거 상수로 변환해서 변수에 대입
		switch ( week ) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.THESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATUDAY; break;
		}

		// 열거 타입 변수를 사용
		if ( today == Week.SUNDAY ) {
			System.out.println( "일요일에는 축구" );
		}else {
			System.out.println( "나머지는 자바 공부" );
		}


	}
}
