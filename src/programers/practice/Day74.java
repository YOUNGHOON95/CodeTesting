package programers.practice;

public class Day74 {
	/*
	 * 문제 설명
		알파벳으로 이루어진 문자열 myString이 주어집니다. 모든 알파벳을 대문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
		
		입출력 예
			myString	result
			"aBcDeFg"	"ABCDEFG"
			"AAA"		"AAA"
		
		=> 1.대소문자 변환하는 문제가 2개 있어서 toUpperCase toLowerCase 사용해서 2문제 풀었습니다
	 */
    public String solution(String myString) {
        String answer = "";
        //answer = myString.toLowerCase();
        answer = myString.toUpperCase();

        return answer;
    }
}
