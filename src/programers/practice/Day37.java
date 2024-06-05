package programers.practice;

public class Day37 {
	/*
	 * 문제 설명
		음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같은 것이 알려져 있습니다.
		이 사실을 이용하여 음이 아닌 정수가 문자열 number로 주어질 때, 이 정수를 9로 나눈 나머지를 return 하는 solution 함수를 작성해주세요.
		
		입출력 예
		number					result
		"123"					6
		"78720646226947352489"	2
		
		=> 처음에는 그냥 9로 나눠서 나머지만 구하면 될줄 알았다 ( %) 계속 실패하고 나서야 문제를 다시 보고 풀었다.... 
				=> 근데 '0'은 왜 빼는 건가요??
	 */
    public int main(String number) {
        int answer = 0;

        for(int i=0; i<number.length(); i++) {
            answer += number.charAt(i) - '0';
        }

        answer %= 9;

        return answer;
    }
}