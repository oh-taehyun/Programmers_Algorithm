package lv0;

public class 두수의연산값비교하기 {
	public int solution(int a, int b) {
		int answer=0;
		String a1 = String.valueOf(a);
		String b1 = String.valueOf(b);
		int ab = Integer.parseInt(a1+b1);
		if(ab>=(2*a*b)) {
			answer=ab;
		}else {
			answer=2*a*b;
		}
		return answer;
	}
}
