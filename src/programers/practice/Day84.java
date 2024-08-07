package programers.practice;
import java.util.*;

public class Day84 {
	/*
	 * 문제 설명
		임의의 문자열이 주어졌을 때 문자 "a", "b", "c"를 구분자로 사용해 문자열을 나누고자 합니다.
		예를 들어 주어진 문자열이 "baconlettucetomato"라면 나눠진 문자열 목록은 ["onlettu", "etom", "to"] 가 됩니다.
		문자열 myStr이 주어졌을 때 위 예시와 같이 "a", "b", "c"를 사용해 나눠진 문자열을 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
		단, 두 구분자 사이에 다른 문자가 없을 경우에는 아무것도 저장하지 않으며, return할 배열이 빈 배열이라면 ["EMPTY"]를 return 합니다.
		
	   입출력 예
			myStr					result
			"baconlettucetomato"	["onlettu", "etom", "to"]
			"abcd"					["d"]
			"cabab"					["EMPTY"]	
			
		입출력 예 #1
			문제 설명의 예시와 같습니다.
		입출력 예 #2
			"c" 이전에는 "a", "b", "c" 이외의 문자가 없습니다.
			"c" 이후에 문자열 "d"가 있으므로 "d"를 저장합니다.
			따라서 ["d"]를 return 합니다.
		입출력 예 #3
			"a", "b", "c" 이외의 문자가 존재하지 않습니다. 따라서 저장할 문자열이 없습니다.
			따라서 ["EMPTY"]를 return 합니다.
			
		=>1. a, b, c를 모두 공백으로 바꿔준다 2.String배열에 myStr을 공백으로 나눈 문자열들을 저장한다. 3.String배열의 ""를 제외한 문자열들을 answer에 저장하고 아무것도 저장되지 않았다면 "EMPTY"를 저장한다.
	 */		
	   public List<String> main(String myStr) {
	        List<String> answer = new ArrayList<>();
	        myStr = myStr.replace("a"," ");
	        myStr = myStr.replace("b"," ");
	        myStr = myStr.replace("c"," ");
	        String[] list = myStr.split(" ");
	        for (String i : list)
	            if (!i.equals(""))
	                answer.add(i);
	        if (answer.size()==0) answer.add("EMPTY");
	        return answer;
	    }
	}
