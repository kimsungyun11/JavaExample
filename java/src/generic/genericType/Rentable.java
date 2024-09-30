package generic.genericType;

// 타입 파라미터 p 정의
public interface Rentable<P> {
	
	// 타입 파라미털 P를 리턴 타입으로 사용
	P rent();
	
}
