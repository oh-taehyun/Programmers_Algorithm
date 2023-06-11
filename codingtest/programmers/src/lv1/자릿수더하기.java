package lv1;
import java.util.*;
public class 자릿수더하기 {
	public int solution(int n) {
		int answer=0;
		String a = String.valueOf(n);
		String b[]=a.split("");
		for(int i=0;i<b.length;i++) {
			answer+= Integer.parseInt(b[i]);
		}
		return answer;
	}

}
