package lv1;
/*
 * 시저 암호: 어떤 문자의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식
 * ex) "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됨. "z"는 1만큼 밀면 "a"가 됨 
 *  문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성하라
 *  1. 아스키 코드표를 보면 z는 122 Z는 90 인데 1을 밀었을 때 a가 된다고 하면 a는 97 A는 65
 *  이므로 z에서 n만큼 밀때 26을 빼면 원하는 암호가 나온다
 *  2. 아스키 코드를 이용하려면 문자를 char형으로 바꿔야한다. 문자열을 char형 배열로 바꾸는 toCharArray메서드를
 *  이용하면 된다.
 *  3. char형을 비교할 때는 String과 다르게 equals가 아닌 ==으로 비교한다. 대신 작은 따옴표로 문자를 감싸야한다.
 *  4. 주어진 문자열 s에는 공백이 포함되어있으므로 공백이 있다면 continue로 건너뛰어야 한다.
 *  아스키코드를 이용
 *  5.char 배열로 변환된 주어진 문자열 s를 탐색하며 n번째 탐색 전까지 j번째 문자에 1씩 더해준다
 *  6. 문자가 z 또는 Z라면 1을 더해주기전 26을 빼준다
 *  7. String 변수에 char형 배열인 arr을 넣어준뒤 리턴한다.
 *  
 */
public class 시저암호 {
	public String solution(String s, int n) {
		String answer ="";
		char[]arr = new char[s.length()];
		arr = s.toCharArray();
		for(int i=0;i<n;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==' ') {
					continue;
				}else {
					if(arr[j]=='z'||arr[j]=='Z') {
						arr[j]-=26;
					}
					arr[j]+=1;
					
				}
			}
		}
		answer = new String(arr);
		return answer;
	}

}
