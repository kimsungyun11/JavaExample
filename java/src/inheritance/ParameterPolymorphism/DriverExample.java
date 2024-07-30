package inheritance.ParameterPolymorphism;

public class DriverExample {
	public static void main( String[] args ) {
	
		// Driver 객체 생성
		Driver driver = new Driver();
		
		// 매개값으로 bus 객체를 제공하고 driver() 메소드 호출
		// driver.drive(new Bus()); 와 동일
		Bus bus = new Bus();
		driver.drive(bus);
		
		// 매개값으로 Taxi 객체를 제공하고 driver() 메소드 호출
		// driver.drive(new taxi()); 와 동일
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		
	}
}
