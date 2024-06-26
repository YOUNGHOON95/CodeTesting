package programers.practice;

public class Day49 {
	/*
	 * 문제 설명
		두 정수 q, r과 문자열 code가 주어질 때, code의 각 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자를 앞에서부터 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요
		
		입출력 예
			q	r	code				result
			3	1	"qjnwezgrpirldywt"	"jerry"
			1	0	"programmers"		"programmers"
		
		=> 문자 하나하니씩 뽑은 다음 조건식에 맞는 문자열을 넣는다 생각하고 일단 두들겼더니 맞았다.....
	 */
    public String main(int q, int r, String code) {
        String answer = "";
        for(int i = 0 ; i < code.length() ; i++){
            if(i % q == r){
                answer += code.charAt(i);
            }
        }
        return answer;
    }
}