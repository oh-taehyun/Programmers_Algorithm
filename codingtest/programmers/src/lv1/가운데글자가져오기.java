package lv1;
/*
 * 단어 s의 가운데 글자를 반환하는 함수, solution 만들기
 * 댠어의 길이가 짝수라면 가운데 두글자를 반환
 */
public class 가운데글자가져오기 {
	public String solution(String s) {
		String answer = "";
		String temp[]=s.split("");
		if(temp.length%2!=0) {
			answer = temp[temp.length/2];
		}else {
			answer = temp[(temp.length-1)/2]+temp[(temp.length-1)/2+1];
		}
		return answer;
	}
}
