package lv0;

public class 문자열겹쳐쓰기 {
	public String solution(String my_string,String overwrite_string,int s) {
		String answer="";
		answer=my_string.substring(0,s)+overwrite_string+my_string.substring(overwrite_string.length()+s);
		return answer;
	}
}
