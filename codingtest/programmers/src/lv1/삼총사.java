package lv1;
/*
 * 삼총사가 될 수 있는 방법 수 구하기
 * 주어진 배열에서 3개를 더했을 때 0이 나오면 삼총사가 될 수 있음
 * 삼중 for문 사용
 */
public class 삼총사 {
 public int solution(int number[]){
	 int answer=0;
	 for(int i=0;i<number.length;i++) {
		 for(int j=i+1;j<number.length;j++) {
			 for(int k=j+1;k<number.length;k++) {
				 if((number[i]+number[j]+number[k])==0) {
					 answer +=1;
				 }
			 }
		 }
	 }
	 return answer;
 }
}
