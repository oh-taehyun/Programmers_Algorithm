package lv1;

public class 크기가작은부분문자열 {
	public int solution(String t, String p) {
		int answer =0;
		String temp[]=new String[t.length()-p.length()+1];
			for(int i=0;i<temp.length;i++) {
				temp[i]=t.substring(i,i+p.length());
				if(Long.parseLong(temp[i])<=Long.parseLong(p)) {
					answer +=1;
				}
			}
		return answer;
	}
}
