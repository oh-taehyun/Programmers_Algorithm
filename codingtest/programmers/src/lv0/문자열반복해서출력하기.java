package lv0;
import java.util.*;
import java.io.*;
public class 문자열반복해서출력하기 {
	public static void main(String[]args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		int n = Integer.parseInt(st.nextToken());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String answer="";
		for(int i=0;i<n;i++) {
			answer +=str;
		}
		bw.write(answer);
		bw.flush();
	}
}
