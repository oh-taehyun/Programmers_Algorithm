package lv0;
import java.util.*;
public class 배열의유사도 {
	public int solution(String[] s1, String[]s2) {
		String[]arr = new String[0];
		int answer=0;
		if(s1.length>s2.length) {
			arr = Arrays.copyOf(s2,s2.length+(s1.length-s2.length) );
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					if(s1[i].equals(arr[j])) {
						answer++;
					}
				}
			}
		}else {
			arr = Arrays.copyOf(s1, s1.length+(s2.length-s1.length));
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					if(s2[i].equals(arr[j])) {
						answer++;
					}
				}
			}
		}
		
		return answer;
	}
}
