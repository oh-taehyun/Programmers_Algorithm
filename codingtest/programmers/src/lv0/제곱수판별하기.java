package lv0;

public class 제곱수판별하기 {
	public int solution(int n) {
		int answer=0;
		double m = Math.sqrt(n);
		if(n==Math.pow((int)m, m)) {
			answer=1;
		}else {
			answer=2;
		}
		return answer;
	}
}
