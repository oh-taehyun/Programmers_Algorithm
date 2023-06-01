package lv0;

public class 숨어있는숫자의덧셈 {
	public int solution(String my_string) {
		int answer=0;
		String replace = my_string.toLowerCase().replaceAll("[abcdefghijklmnopqrstuwxyz]","" );
		String arr[]=replace.split("");
		for(int i=0;i<arr.length;i++) {
			answer += Integer.parseInt(arr[i]);
		}
		return answer;
	}
}
