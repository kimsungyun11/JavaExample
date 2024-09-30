package generic.genericType;

// 타입 파라미터 p를 home로 대체
public class HomeAgency implements Rentable<Home> {
	
	// 리턴타입이 반드시 home이어야 함
	@Override
	public Home rent() {
		// TODO Auto-generated method stub
		return new Home();
	}

}
