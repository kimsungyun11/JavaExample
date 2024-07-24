package Class;

public class CarExample {

	public static void main(String[] args) {
		
		// car 객체 생성
		Car mycar = new Car( "그랜저", "검정", 250 );
		
		// Car 객체의 필드값 읽기
		System.out.println( "회사 :" + mycar.company );
		System.out.println( "모델 :" + mycar.model );
		System.out.println( "색깔 :" + mycar.color );
		System.out.println( "최고속도 :" + mycar.maxSpeed );
		System.out.println( "현재속도 :" + mycar.speed );
		
		// car 객체의 필드값 변경
		mycar.speed = 60;
		System.out.println( "수정 속도 : " + mycar.speed );

	}
}
