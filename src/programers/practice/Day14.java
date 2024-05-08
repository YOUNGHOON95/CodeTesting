package programers.practice;

public class Day14 {
	/*
	 * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

		12 ⊕ 3 = 123
		3 ⊕ 12 = 312
		양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
		
		단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
	 * 
	 * 입출력 예
		a	b	result
		2	91	364
		91	2	912
	 * 	 
	 * => 전에 문제랑 비슷하게 생각 했다 행변환.. 그러면서 if문 말고 삼항연산자로 생각 해봤다.
	 */
	public int main(int a, int b) {
        String ab = Integer.toString(a) + Integer.toString(b);
        int ab_int = Integer.valueOf(ab);
        int a_b = 2 * a * b;
        
        return ab_int >= a_b ? ab_int : a_b;
    }

}
