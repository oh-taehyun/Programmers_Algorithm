package lv0;

public class n개간격의원소 {
	public int[]solution(int[]num_list,int n){
		int[]answer;
		int index=0;
		if(num_list.length%n==0) {
			answer=new int[num_list.length/n];
		}else {
			answer=new int[num_list.length/n+1];
		}
		for(int i=0;i<num_list.length;i+=n) {
			answer[index++]=num_list[i];
		}
		return answer;
	}
}
