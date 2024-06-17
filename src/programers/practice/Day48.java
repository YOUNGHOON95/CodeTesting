package programers.practice;

public class Day48 {
	/*
	 * 문제 설명
		문자열 my_string과 두 정수 m, c가 주어집니다. 
		my_string을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.
		
		
		입출력 예
			my_string					m	c	result
			"ihrhbakrfpndopljhygc"		4	2	"happy"
			"programmers"				1	1	"programmers"
	 */

    public String main(String my_string, int m, int c) {
    	//m만큼 글자씩 쓰기...
        String answer = "";

        for (int i = c - 1; i < my_string.length(); i += m) {
            answer += my_string.charAt(i);
        }
        return answer;
        //for문 조건식을 바꾸는 방식... 생각하지 못한 방법이였다
    }
}
