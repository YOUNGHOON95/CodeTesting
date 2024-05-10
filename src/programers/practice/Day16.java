package programers.practice;

public class Day16 {
	/*
	 * 정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.
	 * 
	 *  입출력 예
		number	n	m	result
		60		2	3	1
		55		10	5	0
		
		=> n 과 m의 공통 배수를 찾는 문제... and 연산자를 이용해 2개의 조건을 다 만족할때 참 과 거짓을 판별한다
	 */
	
	public int main(int number, int n, int m) {
		 int answer = number % n == 0 && number % m == 0 ? 1 : 0;
	     return answer;
	}

}
