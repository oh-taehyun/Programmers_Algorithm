package lv1;

import java.util.ArrayList;
import java.util.Arrays;
/*
 * 나누어 떨어지는 숫자 배열
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수 작성
 * element가 하나도 없다면 배열에 -1을 담아 반환
 * 
 * arr의 요소 값들에 따라 반환되는 answer 요소들의 개수가 가변적이기 때문에 ArrayList를 활용해야함
 * 1)ArrayList 배열 list를 선언해준다.
 * 2) answer는 오름차순으로 반환되어야하기 때문에 Arrays.sort()메서드로 배열 arr을 미리 정렬해준다.
 * 3) for 반복문을 만들어 arr[i]가 divisor로 나누어 떨어진다면 
 * 	  ArrayList의 add메서드로 해당 arr[i]를 추가해준다.
 * 4)만약 divisor로 나누어 떨어지는 arr 요소가 하나도 없어 list의 크기가 0이라면 1크기의 answer 배열을 선언한 후
 *   answer의 첫번째 요소에 -1을 대입해준다.
 * 5)그렇지 않고 list의 크기가 0보다 크다면 list 요소 개수들 만큼의 크기를 가진 answer 배열을 선언한다.
 * 6)반복문을 돌려 answer에 list의 요소들을 추가한다.
 */
public class 나누어떨어지는숫자배열 {
	public int[] solution(int[]arr,int divisor) {
		int[]answer = {};
		ArrayList<Integer>list = new ArrayList<Integer>();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%divisor==0) {
				list.add(arr[i]);
			}else continue;
		}
		if(list.size()==0) {
			answer = new int[1];
			answer[0]=-1;
		}else {
			answer = new int[list.size()];
			for(int i=0;i<answer.length;i++) {
				answer[i]=list.get(i);
			}
		}
		return answer;
	}
}