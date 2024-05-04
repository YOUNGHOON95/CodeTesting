package programers.practice;

public class Day12 {
	public String main(String my_string, int k) {
		/*
		 * 문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
		 * 
		 *   my_string	k	 result
		 *	 "string"	3	 "stringstringstring"
		 *	 "love"	    10	 "lovelovelovelovelovelovelovelovelovelove"
		 * 
		 * 반복문 돌리면 될거라고 생각
		 * => 다른 풀이 보니까 repeat 함수 사용함  참고 사항
		 *
		 * 
		 */
		String answer = "";
		for(int i = 0 ; i <= k ; i++) {
			answer += my_string;
		}
		
		return answer;
	 }
}
