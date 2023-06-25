package lv1;
/*
 * 임의의 양의 정수 n에 대해 n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하기
 * n이 양의 정수 n의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면,
 * -1을 리턴
 * 함수 Math.sqrt(n)은 제곱하면 n이 되는 수로 이 함수의 제곱근은 Math.pow()함수를
 * 이용해 Math.pow(Math.sqrt(n),2)로 나타낸다.
 * 이 때 Math.pow()함수는 double 타입을 반환 하기에,
 * 정수 x의 제곱을 알려면 if 조건에는 Math.sqrt(n)을 int타입으로 형변환을 해야한다.
 * Math.sqrt()함수는 float타입을 반환하는데
 * solution메서드의 반환타입이 long이므로, 조건에 대한 반환 값인 Math.pow(Math.sqrt(n)+1, 2)은 long타입으로 변환해주어야 한다.
 */
public class 정수제곱근판별 {
	public long solution(long n) {
		if(Math.pow((int)Math.sqrt(n), 2)==n) {
			return (long)Math.pow(Math.sqrt(n)+1, 2);
		}
		return -1;
	}
}
