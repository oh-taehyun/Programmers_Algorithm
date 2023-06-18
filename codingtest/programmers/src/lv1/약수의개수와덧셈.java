package lv1;
/*
 * 두 정수 left와 right가 주어짐
 * left~right 의 정수들 중 약수 개수가 짝수인 수는 더하고
 * 홀수인 수는 뺀수를 return
 * 약수가 홀수인 경우는 제곱수(예. 16,25...)
 * 제곱수인 경우 빼고 아닌경우는 더하면 됨
 */
public class 약수의개수와덧셈 {
	public int solution(int left, int right) {
		
		long ans=0;
		int answer=0;
		for(int i=0;i<(right-left);i++) {
			ans=(long)Math.sqrt(left+i);
			if((left+i)==Math.pow(ans, 2)) {
				answer -= (left+i);
			}else {
				answer += (left+i);
			}
		}
		return answer;
	}
}
