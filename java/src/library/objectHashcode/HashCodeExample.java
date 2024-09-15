package library.objectHashcode;

public class HashCodeExample {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		
		if ( s1.hashCode() == s2.hashCode() ) {
			if ( s1.equals(s2) ) {
				System.out.println( "==" );
			} else {
				System.out.println( "!=" );
			}
		} else {
			System.out.println( "해시코드가 다르므로 동등 객체가 아님" );
		}

	}

}
