package lv1;

import java.util.Stack;

/*
 * 주어진 배열 arr에서 연속적으로 나타나는 숫자를 하나만 남기고
 * 전부 제거하려고 함
 *스택(LIFO(Last-In,First-Out)을 활용해서 풀수있음
 *1.arr의 크기만큼 반복하면서 스택의 마지막으로 들어간 숫자를 확인(peek)하여 이전에 들어간 숫자와 같지 않으면 스택에 쌓아준다(push)
 *2.return할 answer배열의 사이즈를 스택의 크기로 생성한다 -> int[]answer = new int[stack.size()];
 *3. 생성된 배열(answer)에 마지막 idx부터 데이터 set한다(스택은 후입선출의 선행구조를 가지고 있기때문에 pop()은 최상위 요소를 반환한다.)
 * stack에 값이 없는 상태에서 peek()메소드 사용시 Exception이 발생하므로 사이즈 체크 조건을 사용해야 함
 */
public class 같은숫자는싫어 {
	public int[]solution(int[]arr){
		
		Stack<Integer>stack = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			if(stack.size()==0||arr[i]!=stack.peek()) {
				stack.push(arr[i]);
			}
		}
		int[]answer= new int[stack.size()];
		for(int i=stack.size()-1;i>=0;i--) {
			answer[i]=stack.pop();
		}
		return answer;
	}
}
