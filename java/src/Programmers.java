public class Programmers {

	public String solution(String[] str_list, String ex) {
		String answer = "";
		
		StringBuffer buffer = new StringBuffer();

		for ( int i = 0; i < str_list.length; i++ ) {
			
			if ( !( str_list[i].contains(ex)) ) {
				buffer.append(str_list[i]);
			}
			
		}
		
		answer = buffer.toString();
		
		return answer;
	}

}