package nested.nestedInterface;


public class ButtonExample {

	public static void main(String[] args) {
		// OK 버튼 객체 생성
		Button btnOk = new Button();
		
		// ok 버튼 클릭 이벤트를 처리할 clickListener 구현 클래스 ( 로컬 클래스 )
		class OkListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println( "ok 버튼을 클릭" );
			}
		}
		
		// ok 버튼 객체에 clickListener 구현 객체 주입
		btnOk.setClickListener( new OkListener() );
		
		// ok 버튼 클릭하기
		btnOk.click();
		
		// -------------------------------------------------------------------------------------------
		
		// cancel 버튼 객체 생성
		Button btnCancel = new Button();
		
		// cancel 버튼 클릭 이벤트를 처리할 clickListener 구현 클래스 ( 로컬 클래스 )
		class CancelListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println( "cancel 버튼을 클릭함" );
			}
			
		}
		
		// cancel 버튼 객체에 clickListener 구현 객체 주입
		btnCancel.setClickListener(new CancelListener());
		
		// cancel 버튼 클릭하기
		btnCancel.click();

	}

}
