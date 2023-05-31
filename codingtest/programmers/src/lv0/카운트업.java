package lv0;

import java.util.stream.IntStream;

public class 카운트업 {
	public int[]solution(int start, int end){
		return IntStream.rangeClosed(start, end).toArray();
	}
}
