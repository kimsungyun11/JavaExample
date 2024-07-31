package inheritance.abstractClass;

// 추상 클래스를 new 연산자로 직접 생성할 수는 없지만 자식 객체는 new 연산자로 생성 가능
public class PhoneExample {

	public static void main(String[] args) {
		
		// Phone phone = new Phone(); // 불가능
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
