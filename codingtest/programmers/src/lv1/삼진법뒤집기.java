package lv1;
/*
 * 자연수 n이 매개변수로 주어짐. n을 3진법 상에서 앞뒤로 뒤집은 후, 다시 10진법으로 표현한 수를
 * return하는 함수를 완성하기
 * 1. int는 전부 10진수로 인식하므로 String 변수에 toString(int n, int radix)를 통해3진법으로 담는다.
 * 2. StringBuilder에서 제공하는 reverse()메서드로 3진법으로 전환된 n을 뒤집고 toString을 이용해 String으로 변환해준다.
 * 3. Integer.parseInt(String s, int radix)를 통해 다시 int형으로 변환해 10진법의 수를 반환한다.
 */
public class 삼진법뒤집기 {
	public int solution(int n) {
		int answer=0;
		String temp = new StringBuilder(Integer.toString(n,3)).reverse().toString();
		answer=Integer.parseInt(temp,3);
		return answer;
	}
}
