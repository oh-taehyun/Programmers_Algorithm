package lv0;
/*
 * 문자열 A가 다른 문자열 B에 속하면 A를 B의 부분문자열이라 함
 * 문자열 str1과 str2가 주어질 때 str1이 str2의 부분문자열이라면
 * 1을 아니라면 0을 return
 */
public class 부분문자열 {
	public int solution(String str1, String str2) {
		int answer=0;
		if(str2.contains(str1)) {
			answer=1;
		}
		return answer;
	}
}
