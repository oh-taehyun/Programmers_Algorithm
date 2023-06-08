package lv0;

public class 코드처리하기 {
	public String solution(String code) {
        String answer = "";
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') mode = 1 - mode;//mode가 1이라면 0으로 바뀌고 0이라면 1로 바뀜
            else if (i % 2 == mode) answer += code.charAt(i);//mode가 1일 때 홀수이므로 code[i]가 더해지고, mode가 0일 때 짝수이므로 code[i]가 더해짐
        }
        return "".equals(answer) ? "EMPTY" : answer;
    }
}
