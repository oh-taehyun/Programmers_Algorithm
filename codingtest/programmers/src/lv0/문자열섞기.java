package lv0;

public class 문자열섞기 {
	    public String solution(String str1, String str2) {
	        String answer = "";
	        String []s1=str1.split("");
	        String []s2 = str2.split("");
	        for(int i=0;i<s1.length;i++){
	            answer=answer+s1[i]+s2[i];
	        }
	        return answer;
	    }
	}

