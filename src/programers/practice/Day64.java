package programers.practice;

import java.util.Arrays;

public class Day64 {
	/*
	 * 문제 설명
		문자열 리스트 str_list에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장되어 있습니다. 
		str_list에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 해당 문자열을 기준으로 왼쪽에 있는 문자열들을 순서대로 담은 리스트를, 
		먼저 나오는 문자열이 "r"이라면 해당 문자열을 기준으로 오른쪽에 있는 문자열들을 순서대로 담은 리스트를 return하도록 solution 함수를 완성해주세요. 
		"l"이나 "r"이 없다면 빈 리스트를 return합니다.
	  
	    str_list				result
		["u", "u", "l", "r"]	["u", "u"]
		["l"]					[]
		
		입출력 예 #1
			"r"보다 "l"이 먼저 나왔기 때문에 "l"의 왼쪽에 있는 문자열들을 담은 리스트인 ["u", "u"]를 return합니다.
		입출력 예 #2
			"l"의 왼쪽에 문자열이 없기 때문에 빈 리스트를 return합니다.
		
		=> 1.우선 for문으로 str_list만큼 반복 2.조건문(l이면 왼 r이면 오)기준으로 분기 3. 조건에 따른 결과값 출력
	 */
	 public String[] main(String[] str_list) {
	        String[] answer = {};
	        for (int i = 0; i < str_list.length;i++) {
	            if (str_list[i].equals("l")) {
	                return Arrays.copyOfRange(str_list, 0, i);
	            } else if (str_list[i].equals("r")) {
	                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
	            }
	        }
	        return answer;
	    }
	}