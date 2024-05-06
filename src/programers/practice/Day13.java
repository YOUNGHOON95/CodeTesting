package programers.practice;

public class Day13 {
	/*
	 * 
	 * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
	 *	
	 *	12 ⊕ 3 = 123
	 *	3 ⊕ 12 = 312
	 *	양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
	 *	
	 *	단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
	 * 
	 * 
	 *  입출력 예
	 * 	a	b	result
	 *	9	91	991
	 *	89	8	898
	 * 
	 * => 값 받을때 int 합치려면 String이여야 한다... 행변환을 생각!
	 * 
	 * Integer.toString(int값) / Integer.valueOf(String값);
	 * 
	 * 
	 * \삼항연산자....
	 * 
	 */
	public int main(int a , int b) {
		
		String ab = Integer.toString(a) + Integer.toString(b);
		String ba = Integer.toString(b) + Integer.toString(a);
		int a_b = Integer.valueOf(ab);
		int b_a = Integer.valueOf(ba);
		
		/*if(a_b >= b_a) {
			return a_b;
		}else {
			return b_a;
		}*/
		
		return a_b >= b_a ? a_b :b_a;
		
	}

}
