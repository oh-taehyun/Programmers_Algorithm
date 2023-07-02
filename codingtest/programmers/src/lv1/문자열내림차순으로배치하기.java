package lv1;

import java.util.Arrays;
import java.util.Collections;
/*
 * 문자열 s에 주어진 문자를 내림차순으로 정렬해 새로운 문자열을 리턴하는 함수 완성하기
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은것으로 간주함
 * Arrays.sort 오름차순: 숫자-대문자-소문자-한글 순서로 정렬
 * 내림차순: 한글-소문자-대문자-숫자
 */
public class 문자열내림차순으로배치하기 {
	public String solution(String s) {
		String answer ="";
		String temp[]=s.split("");
		Arrays.sort(temp,Collections.reverseOrder());
		for(int i=0;i<temp.length;i++) {
			answer += temp[i];
		}
		return answer;
	}
}
