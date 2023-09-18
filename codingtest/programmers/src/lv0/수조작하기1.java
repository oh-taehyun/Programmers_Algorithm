package lv0;

public class 수조작하기1 {
	public int solution(int n, String control) {
		int answer = n;
		String[] tmp = control.split("");
		for(int i=0;i<tmp.length;i++) {
			if(tmp[i].equals("w")) {
				answer += 1;
			}else if(tmp[i].equals("s")) {
				answer -= 1;
			}else if(tmp[i].equals("d")) {
				answer +=10;
			}else if(tmp[i].equals("a")) {
				answer -=10;
			}
		}
		return answer;
	}
}
