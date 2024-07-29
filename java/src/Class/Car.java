package Class;

public class Car {

	// 필드 선언
	String company = "현대";
	String model = "그랜저";  // null
	String color = "검정";  // null
	boolean start; // false
	int maxSpeed = 350;	   // 0
	int speed;	   // 0

	// 생성자 오버로딩
	Car() {

	}
	// 2번
	Car ( String model ) {
		this.model = model;
	}
	// 3번
	Car ( String model, String color ) {
		this.model = model;
		this.color = color;
	}
	// 4번
	Car( String model, String color, int maxSpeed ) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}



}
