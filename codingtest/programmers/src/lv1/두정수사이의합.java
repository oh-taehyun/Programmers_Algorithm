package lv1;
/*
 * 두 정수 a,b가 주어졌을 때 a와 b사이에 속한 모든 정수의 합
 * 1)a와 b가 같은 경우: 둘중 아무거나 반환
 * 2)a가 더 큰 경우: b에서 a사이의 정수 더한 수 반환
 * 3)b가 더 큰 경우: a에서 b사이의 정수 더한 수 반환
 */
public class 두정수사이의합 {
	public long solution(int a, int b) {
		long answer=0;
		if(a<b) {
			for(int i=a;i<=b;i++) {
				answer +=i;
			}
		}else if(a>b) {
			for(int i=b;i<=b;i++) {
				answer += i;
			}
		}else {
			answer=a;
		}
		return answer;
	}
}
