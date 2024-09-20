package library.objectTostring;

public class ToStringExample {

	public static void main(String[] args) {
		SmartPhone myPhon = new SmartPhone("삼성전자", "안드로이드");
		
		String strObj = myPhon.toString();
		
		System.out.println( strObj );
		
		System.out.println( myPhon );

	}

}
