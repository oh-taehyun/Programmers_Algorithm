package lv0;
/*
 * rny_string이 주어질 때, 주어진 문자열의 모든 'm'을 'rn'으로 바꾼
 * 문자열을 return하는 solution을 작성해라
 * replace 함수 이용하면 됨. 주의점은 replace안에 기존의 문자와 바꿀 문자를 넣을 때
 * 작은 따옴표가 아닌 큰 따옴표 안에 넣어줘야 한다는 것이다
 */
public class rny_string {
	public String solution(String rny_string) {
		String answer="";
		answer=rny_string.replace("m", "rn");
		return answer;
	}
}
