package lv1;

public class 문자열내p와y의개수 {
	boolean solution(String s) {
		boolean answer = true;
		String []t = s.toLowerCase().split("");
		int p=0;
		int y=0;
		for(int i=0;i<t.length;i++) {
			if(t[i].equals("p")) {
				p +=1;
			}else if(t[i].equals("y")) {
				y+=1;
			}
		}
		if(p==y) {
			answer=true;
		}else if(p!=y) {
			answer=false;
		}
		return answer;
	}
}
