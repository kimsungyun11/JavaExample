package Class.Overloading;

public class OverloadingExample {

	public static void main(String[] args) {

		// 객체 생성
		Overloading myCalcu = new Overloading();

		// 정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);

		// 직사각혛의 넓이 구하기
		double result2 = myCalcu.areaRectangle(10, 20);

		System.out.println( "정사각형 : " + result1 );
		System.out.println( "직사각형 : " + result2 );

	}

}
