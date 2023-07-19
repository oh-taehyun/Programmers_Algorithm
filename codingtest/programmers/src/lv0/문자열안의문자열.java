package lv0;

public class 문자열안의문자열 {
	public int solution(String str1, String str2) {
		int answer =2;
		int j=str1.length()-str2.length()+1;
		for(int i=0;i<j;i++) {
			if(str1.substring(i,str2.length()+i).equals(str2)) {
				answer=1;
			}
		}
		return answer;
	}
}
