package Class;

public class CarExample {

	public static void main(String[] args) {

		// car 객체 생성
		Car mycar = new Car("그랜저", "검정", 250);

		// Car 객체의 필드값 읽기
		System.out.println("회사 :" + mycar.company);
		System.out.println("모델 :" + mycar.model);
		System.out.println("색깔 :" + mycar.color);
		System.out.println("최고속도 :" + mycar.maxSpeed);
		System.out.println("현재속도 :" + mycar.speed);

		// car 객체의 필드값 변경
		mycar.speed = 60;
		System.out.println("수정 속도 : " + mycar.speed);

		// 생성자 호출
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();

		// 2번 생성자
		Car car2 = new Car("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();

		// 3번
		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();

		// 4번
		Car car4 = new Car("자가용", "빨강", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();

	}
}
