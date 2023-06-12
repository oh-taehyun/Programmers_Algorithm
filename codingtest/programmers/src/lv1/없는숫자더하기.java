package lv1;
/*
 * 없는 숫자 더하기
 * 0부터 9까지의 일부 숫자가 들어있는 정수 배열numbers가 주어짐
 * numbers에는 없는 숫자를 더해야함
 * 1~9까지의 숫자를 더한 후 거기서 numbers에 있는 모든 숫자를 더한 것을 빼면 
 * numbers에 없는 숫자끼리 더한 값이 나옴
 */
public class 없는숫자더하기 {
	public int solution(int numbers[]) {
		int answer=0;
		int a[]= {1,2,3,4,5,6,7,8,9};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<a.length;i++) {
			sum1 += a[i];
		}
		for(int i=0;i<numbers.length;i++) {
			sum2+=numbers[i];
		}
		answer=sum1-sum2;
		return answer;
	}

}
