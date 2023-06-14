package lv1;
/*
 * 부족한 금액 계산하기
 * 놀이기구를 count번 타게되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지 return
 * 놀이기구를 n번째 이용한다면 원래 가격의 n배를 받음
 * 금액이 부족하지 않으면 0을 return
 * 놀이기구를 타는데 필요한 총 금액을 total이라고 정의함
 */
public class 부족한금액계산하기 {
	public long Solution(int price, int money, int count) {
		long answer=0;
		long total=0;
		for(int i=1;i<=count;i++) {
			total +=price*i;
		}
		if(money<=total) {
			answer=Math.abs(money-total);
		}else {
			answer=0;
		}
		return answer;
	}
}
