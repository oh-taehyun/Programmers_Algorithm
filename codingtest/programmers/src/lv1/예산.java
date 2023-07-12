package lv1;

import java.util.Arrays;

public class 예산 {
	public int solution(int[]d,int budget) {
		Arrays.sort(d);
		int sum=0;
		int i=0;
		int answer = 0;
		
		while(i<d.length) {
			sum += d[i];
			i++;
			answer +=1;
			if(sum>budget) {
				answer -=1;
				break;
			}
		}
		return answer;
	}
}
