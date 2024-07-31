package programers.practice;
import java.util.*;

public class Day81 {
	/*
	 * 제 설명
		문자열 myString이 주어집니다. 
		myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
		
		입출력 예
			myString		result
			"oxooxoxxox"	[1, 2, 1, 0, 1, 0]
			"xabcxdefxghi"	[0, 3, 3, 3]
		입출력 예 #1
			"x"를 기준으로 문자열을 나누면 ["o", "oo", "o", "", "o", ""]가 됩니다. 각각의 길이로 배열을 만들면 [1, 2, 1, 0, 1, 0]입니다. 따라서 [1, 2, 1, 0, 1, 0]을 return 합니다.
		입출력 예 #2
			"x"를 기준으로 문자열을 나누면 ["", "abc", "def", "ghi"]가 됩니다. 각각의 길이로 배열을 만들면 [0, 3, 3, 3]입니다. 따라서 [0, 3, 3, 3]을 return 합니다.
			
		
	 */
    public List<Integer> solution(String myString) {
        List<Integer> list = new ArrayList<>();
        int temp = 0;
        String[] an = myString.split("x", -1); 
        // -1은 구분자를 만날시에도 분리
        for(int i=0; i<an.length; i++){
            temp = an[i].length();
            list.add(temp);
        }
        return list;
    }
}
