package programers.practice;

public class Day11 {
	/*
	 * 문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
	 *
	 *  입출력 예
	 *	arr	            result
	 *	["a","b","c"]	"abc"
	 * 
	 * 
	 * => 저번 문제 이어 붙이는 거에서 for문으로 하자고 생각해서 풀어봤습니다.
	 * 
	 */
	 public String main(String[] arr) {
		 String answer = "";
		 for(int i = 0 ; i < arr.length; i++) {
			 String a = arr[i];
			 answer += a;
		 }
		 return answer;
	 }
}
