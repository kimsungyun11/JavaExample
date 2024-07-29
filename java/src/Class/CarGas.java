package Class;

// return문 예제
public class CarGas {

	// 필드 선언
	int gas;

	// 리턴값이 없는 메소드로 매개값을 받아서 gass 필드값을 변경
	void setGas ( int gas ) {
		this.gas = gas;
	}

	// 리턴값이 boolean인 메소드로 gas 필드값이 0이면 false를, 0이 아니면 true를 리턴
	boolean isLeftGas() {
		if ( gas == 0 ) {
			System.out.println( "gas가 없음" );
			return false;  // false를 리턴하고 메소드 종료
		}

		System.out.println( "gas가 있음" );
		return true; // true를 리턴하고 메소드 종료
	}

	// 리턴값이 없는 메소드로 gas 필드값이 0이면 return 문으로 메소드를 종료
	void run() {
		while ( true ) {
			if ( gas > 0 ) {
				System.out.println( "달립.(gas잔량 : " + gas + ")" );
				gas -= 1;
			} else {
				System.out.println( "멈춤.(gas잔량 : " + gas + ")" );
				return; // 메소드 종료
			}
		}
	}


}
