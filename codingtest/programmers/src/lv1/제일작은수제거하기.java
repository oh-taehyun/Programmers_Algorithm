package lv1;

import java.util.ArrayList;

/*
 * 제일 작은 수 제거하기
 * 정수를 저장한 배열 arr에서 가장 작은 수를 제거한 배열을 반환하는 함수 만들기
 * arr을 정렬하지 않은 채로 최솟값을 찾아야 하므로 Math.min()메서드를 이용해야 한다.
 */

public class 제일작은수제거하기 {
	public int[]solution(int[]arr){
		int[] answer= {};
		if(arr.length==1) {
			answer = new int[1];
			answer[0]=-1;
		}else {
			ArrayList<Integer>list = new ArrayList<Integer>();
			int min = arr[0];
			for(int i=0;i<arr.length;i++) {
				min=Math.min(min, arr[i]);//min과 arr[i]중 작은 값을 min에 대입한다.
				list.add(arr[i]);
			}
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==min) {
					list.remove(i);//min에 해당하는 인덱스 i번째의 요소를 제거한다.
				}
			}
			answer = new int[list.size()-1];
			for(int i=0;i<answer.length;i++) {
				answer[i]=list.get(i);
			}
		}
		return answer;
	}
}
