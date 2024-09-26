package library.dateClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date now = new Date();
		String str1 = now.toString();
		System.out.println( str1 );
		
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy.mm.dd. HH:mm:ss" );
		String str2 = sdf.format(now);
		System.out.println( str2 );

	}

}
