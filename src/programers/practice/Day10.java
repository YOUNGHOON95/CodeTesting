package programers.practice;

public class Day10 {

	/*
	 * 길이가 같은 두 문자열 str1과 str2가 주어집니다.
	 * 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
	 * 
	 *  str1	  str2	     result
	 * "aaaaa"	 "bbbbb"	"ababababab"
	 * 
	 * 
	 * => 솔직히 생각을 못했다 자르고 붙어야 하나 어찌 섞어야 하나... 
	 * 	  문자열charAt()함수로 for문으로 하나씩 넣는다...
	 * 
	 */
	public String main(String str1, String str2) {
		String answer = "";
		for (int i = 0; i < str1.length(); i++) {
			answer = answer + str1.charAt(i) + str2.charAt(i);
		}
		return answer;
	}
}
