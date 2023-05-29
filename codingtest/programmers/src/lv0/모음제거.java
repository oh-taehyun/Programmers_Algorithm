package lv0;

public class 모음제거 {
	public String solution(String my_string) {
		String replace[]= {"a","e","i","o","u"};
		String answer="";
		for(int i=0;i<replace.length;i++) {
			if(my_string.contains(replace[i])) {
				answer=my_string.replace(replace[i], "");
				my_string=answer;
			}else {
				answer=my_string;
			}
		}
		return answer;
	}
}
