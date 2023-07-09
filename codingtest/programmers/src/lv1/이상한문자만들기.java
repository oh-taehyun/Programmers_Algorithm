package lv1;

public class 이상한문자만들기 {
	public String solution(String s) {
		String answer="";
		//1.공백 기준으로 문자 자르기
		
		// 각 단어는 하나 이상의 공백문자로 구분되어 있는데 공백이 앞에 있을 지 뒤에 있을지 모르므로 
		//split의 limit을 0보다 작은 -1로 줌
		String str[]=s.split(" ",-1);
		
		//2.문자 탐색하기
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<str[i].length();j++) {
				//짝수번째 문자열은 대문자로 바꾼다
				if(j%2==0) {
					answer += String.valueOf(str[i].charAt(j)).toUpperCase();
			    //홀수번째 문자열은 소문자로 바꾼다
				}else {
					answer += String.valueOf(str[i].charAt(j)).toLowerCase();
				}
			}
			//3.단어 뒤에 공백 추가하기
			if(i !=str.length-1) {
				answer += " ";
			}
		}
		System.out.println(answer);
		return answer;
	}

}