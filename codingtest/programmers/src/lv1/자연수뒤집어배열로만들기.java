package lv1;
/*
 * 1. 주어진 자연수를 문자열로 바꾼다
 * 2. 문자열 길이만큼의 int형의 answer 배열을 만든다.
 * 3. 반복문을 형성해 answer 배열의 첫번째부터 마지막 자리까지 순서대로 subStirng으로 temp문자열의 뒤에 문자부터 자른후 int형으로 변환해 집어넣는다.
 */
public class 자연수뒤집어배열로만들기 {
	public int[] solution(long n) {
		
		String temp = String.valueOf(n);
		int[]answer =new int[temp.length()];
		
		for(int i=0;i<answer.length;i++) {
			answer[i]=Integer.parseInt(temp.substring(answer.length-1-i, answer.length-i));
		}
		
		return answer;
	}
}
