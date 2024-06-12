package programers.practice;

import java.util.Arrays;

public class Day43 {
	/*
	 * 문제 설명
		어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
		문자열 my_string이 매개변수로 주어질 때, my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
		
		입출력 예
			my_string		result
			"banana"		["a", "ana", "anana", "banana", "na", "nana"]
			"programmers"	["ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"]
		
		
	 */
    public String[] main(String my_string) {
        //String[] answer = {};
        String[] answer = new String[my_string.length()];

        //index[0]인것 부터 하나씩 빠진다 그리고 정렬
        //인덱스0부터 뺄 생각 자체가 잘못....
        //앞에 문제 뒤에서부터 자르기 활용
        for(int i = 0 ; i < my_string.length() ; i++) {
            answer[i] = my_string.substring(i,my_string.length()); 
        }        
        //정렬
        Arrays.sort(answer);
        
        return answer;
    }
}
