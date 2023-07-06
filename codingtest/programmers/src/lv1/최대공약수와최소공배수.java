package lv1;
/*
 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수 완성하기
 * m이 n보다 클 때 m이 n으로 나누어 떨어진다면
 * 최대공약수는 n이고 최소공배수는 m
 * 나누어 떨어지지 않는다면 m과 n모두 나눴을 때 0이 되게 하는 수가 최대공약수, 두 정수를 곱한 후 최대공약수로 나눈 값이 최소공배수
 */
public class 최대공약수와최소공배수 {
	public int[]solution(int n,int m){
		int[]answer = new int[2];
		if(m>n) {
			if(m%n==0) {
				answer[0]=n;
				answer[1]=m;
			}else {
				for(int i=1;i<m;i++) {
					if(m%i==0 && n%i==0) {
						answer[0]=i;
					}
				}
				answer[1]=m*n/answer[0];
			}
		}else {
			if(m%n==0) {
				answer[0]=m;
				answer[1]=n;
			}else {
				for(int i=1;i<m;i++) {
					if(m%i==0 &&n%i==0) {
						answer[0]=i;
					}
				}
				answer[1]=n*m/answer[0];
			}
			
		}
		return answer;
	}
}
