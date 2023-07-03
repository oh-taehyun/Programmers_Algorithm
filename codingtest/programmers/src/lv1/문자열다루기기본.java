package lv1;
/*
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution 완성하기
 * 아스키 코드표 활용. 반복문을 돌렸을 때 s중 한글자 s.charAt(i)가 48이상 57이하일 때만 숫자
 * 길이가 다르거나 길이가 같지만 숫자가 아닌 문자가 있을 때 임의의 변수 an 에 -1을 더해준다.
 * 반복문이 끝난 후 임의의 변수an이 0보다 작다면 문자가 포함되어있거나 길이가 다른 것이므로 false를 반환한다.
 */
public class 문자열다루기기본 {
	public boolean solution(String s) {
		boolean answer=true;
		int an = 0;
		for(int i=0;i<s.length();i++) {
			if(s.length()==4||s.length()==6) {
				if(s.charAt(i)<48||s.charAt(i)>=58) {
					an-=1;
				}
			}else {
				an-=1;
			}
		}
		if(an<0) {
			answer=false;
		}
		return answer;
	}
}
