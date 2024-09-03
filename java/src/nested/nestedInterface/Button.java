package nested.nestedInterface;

public class Button {	
	
	// 정적 중첩 인터페이스
	public static interface ClickListener {
		// 추상메소드
		void onClick();
	}

	// 필드 
	// 중첩 인터페이스 타입으로 필드와 Setter 선언
	private ClickListener clickListener;

	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	// Button이 클릭되었을 때 실행하는 메소드 선언
	public void click() {
		this.clickListener.onClick();
	}
	
}
