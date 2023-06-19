package lv1;

public class 하샤드수 {
	public boolean solution(int x) {
		boolean answer=true;
		String temp[]=String.valueOf(x).split("");
		int sum=0;
		for(String s:temp) {
			sum += Integer.parseInt(s);
		}
		if(x%sum==0) {
			return answer;
		}else {
			answer=false;
		}
		return answer;
	}
}
