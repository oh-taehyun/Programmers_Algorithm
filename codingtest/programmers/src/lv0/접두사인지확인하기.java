package lv0;

public class 접두사인지확인하기 {
	public int solution(String my_string, String is_prefix) {
		int answer=0;
		String [] ms = my_string.split("");
		String []ip = is_prefix.split("");
		if(my_string.length()<is_prefix.length()) {
			answer=0;
		}else {
			for(int i=0;i<ip.length;i++) {
				if(ms[i].equals(ip[i])) {
					answer +=1;
				}else {
					answer -=1;
				}
			}
			if(answer==ip.length) {
				answer=1;
			}else {
				answer=0;
			}
		}
		return answer;
	}
}
