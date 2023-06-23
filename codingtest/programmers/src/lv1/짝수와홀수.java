package lv1;
/*
 * 짝수와 홀수
 * 정수 num이 짝수면 "Even"을 반환(0도 짝수)
 * 홀수면 "Odd"를 반환하도록 함
 */
public class 짝수와홀수 {
	public String solution(int num) {
		String answer="";
		if(num%2==0) {
			answer="Even";
		}else {
			answer="Odd";
		}
		return answer;
	}

}
