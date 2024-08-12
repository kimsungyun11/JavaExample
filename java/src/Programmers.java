import java.util.ArrayList;
import java.util.Collections;

public class Programmers {
	
	
	
	public String[] solution(String my_string) {
        
        ArrayList<String> list = new ArrayList<String>();
        
        for ( int i = 0; i < my_string.length(); i++ ) {
        	String std = my_string.substring( i, my_string.length() );
        	
        	list.add(std);
        }
        
        Collections.sort(list);
        
        int num = list.size();
        String[] answer = new String[num];
        for ( int i = 0; i < list.size(); i++ ) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
	
	
	

}