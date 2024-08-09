package programers.practice;
import java.util.*;

public class Day86 {
	/*
	 * 문제 설명
		문자열 myString이 주어집니다. "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
		단, 빈 문자열은 반환할 배열에 넣지 않습니다.
		
		입출력 예
			myString			result
			"axbxcxdx"			["a","b","c","d"]
			"dxccxbbbxaaaa"		["aaaa","bbb","cc","d"]
		
		입출력 예 #1
			myString을 "x"를 기준으로 자른 배열은 ["a","b","c","d"]이며, 이 배열은 이미 사전순으로 정렬된 상태입니다. 따라서 해당 배열을 return 합니다.
		입출력 예 #2
			myString을 "x"를 기준으로 자른 배열은 ["d","cc","bbb","aaaa"]이며, 이 배열을 사전순으로 정렬하면 ["aaaa","bbb","cc","d"]입니다. 따라서 해당 배열을 return 합니다.	
		
		=>1.x로 split 해주고 정렬을 하면 될줄 알았다 (공배란 때문에 통과 X)
		  1.똑같이 x로 잘라주고 정렬을 하고 배열에 넣을때 for문으로 공백이 없을떄 배열에 넣어준다
	 */
    public List<String> solution(String myString) {
    	
        //공백란 생각 못함
        //String[] answer = {};
        //answer = myString.split("x");
        //Arrays.sort(answer);
    	
        List<String> answer = new ArrayList<>();
        String ans[] = myString.split("x");
        Arrays.sort(ans);
        for(int i=0; i<ans.length; i++){
            if(!ans[i].equals(""))
            	answer.add(ans[i]);
        }
        return answer;
    }
}