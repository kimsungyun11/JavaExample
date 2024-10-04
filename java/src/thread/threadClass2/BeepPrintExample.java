package thread.threadClass2;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		
		// 작업 1
		Thread thread = new Thread( new Runnable() {
			
			@Override
			public void run() {
				// toolkit 객체 얻기
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for ( int i = 0; i < 5; i++ ) {
					// 비프음 발생
					toolkit.beep();
					try {
						// 0.5초간 일시 정지
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}
			}
		} );  
		thread.start();
		
		// 작업 2
		for ( int i = 0; i < 5; i++ ) {
			System.out.println( "띵" );
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}

}
