package lv1;
/*
 * 모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어진다.
 * 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑을 크기를 return 하도록 solution 함수를 완성해라
 * 지갑의 가로길이가 명함 가로 사이즈들 중 최대 세로길이가 명함 세로 사이즈 중 최대여도 모든 명함을 수납가능하지만 
 * 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들어야 하므로
 * 각 명함의 가로길이와 세로길이를 비교했을 때 더 긴 값들 중 가장 긴 값과
 * 더 짧은 값들 중 가장 긴 값의 크기로 지갑을 만든다면 어느 명함이든 넣을 수 있게 된다.
 * 1.최대값 중 가장 큰값 long_max와 최솟값 중 가장 큰값 short_max 변수를 선언한다. 초기값은 1
 * 2.sizes 2차원 배열을 탐색하며 가로 길이와 세로길이 중 더 큰 값 longer를 Math.max 함수를 통해 구하고
 * 3.더 작은 값 shorter를 Math.min함수를 통해 구한다.
 * 4.만일 longer가 long_max보다 크다면 long_max에 longer를 대입하고
 * 만일 shorter가 short_max보다 크다면 short_max에 shorter를 대입한다.
 * 5.2차원 배열 탐색이 다 끝난 후 산출된 long_max 값과 short_max값을 곱해 반환한다.
 */
public class 최소직사각형 {
	public int solution(int[][]sizes) {
		int answer = 0;
		int long_max = 1;
		int short_max=1;
		for(int i=0;i<sizes.length;i++) {
			int longer = Math.max(sizes[i][0], sizes[i][1]);
			int shorter = Math.min(sizes[i][0], sizes[i][1]);
			if(long_max<longer) {
				long_max=longer;
			}
			if(short_max<shorter) {
				short_max=shorter;
			}
		}
		answer = long_max*short_max;
		return answer;
	}
}
