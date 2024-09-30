package generic.genericType;

// 타입 파라미터 p를 car로 대체
public class CarAgency implements Rentable<Car> {
	
	// 리턴 타입이 반드시 car여야 함
	@Override
	public Car rent() {
		// TODO Auto-generated method stub
		return new Car();
	}

}
