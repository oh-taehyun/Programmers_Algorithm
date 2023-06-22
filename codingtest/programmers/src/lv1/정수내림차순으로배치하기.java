package lv1;

import java.util.*;
/*
 * 주어진 정수 n을 작은 순으로 정렬한 새로운 정수 리턴하기
 * n을 공백을 기준으로 쪼갠 후 정렬을 하고 싶다
 * 1. String.valueOf 함수를 이용해 n을 문자열로 바꿈
 * 2. 문자열로 바뀐 n을 split을 사용해 공백기준으로 쪼개 문자배열 str에 담아줌
 * 3. Arrays.sort와 reverseOrder()함수를 이용해 내림차순으로 정렬
 * 4. 향상된 반복문을 써 str 배열의 요소들을 하나씩 순서대로 꺼내 문자열 s에
 * 담은 후 임시문자열 tmp에 다 더해줌
 * 5.문자열 tmp를 long으로 변환
 */
public class 정수내림차순으로배치하기 {
	public long solution(long n) {
		long answer=0;
		
		String[]str = String.valueOf(n).split("");
		Arrays.sort(str,Collections.reverseOrder());
		String tmp="";
		for(String s:str) {
			tmp+=s;
		}
		answer=Long.parseLong(tmp);
		return answer;
	}
}
