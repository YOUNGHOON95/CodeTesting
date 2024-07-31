package programers.practice;

import java.util.ArrayList;
import java.util.List;

public class Day80 {
	/*
	 * 문제 설명
		문자열 배열 strArr가 주어집니다. 
		배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고 남은 문자열을 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.
		
	   입출력 예
			strArr							result
			["and","notad","abcd"]			["and","abcd"]
			["there","are","no","a","ds"]	["there","are","no","a","ds"]
			
		입출력 예 #1
			1번 인덱스의 문자열인 "notad"는 부분 문자열로 "ad"를 가집니다. 따라서 해당 문자열을 제거하고 나머지는 순서를 유지하여 ["and","abcd"]를 return 합니다.
		입출력 예 #2
			"ad"가 부분 문자열로 들어간 문자열이 존재하지 않습니다. 따라서 원래 배열을 그대로 return 합니다.
		
		=>1.처음은 배열에 반복문for를 사용해서 ad있는 부분을 없애야 겠다 생각했지만 배열에 크기가 다르다라는걸 알지 못하여서 List로 동적으로 만들어서 다시 넣어주었다
	 */
    public List main(String[] strArr) {
// 		  =>"ad"가 포함된 모든 문자열을 삭제하면 배열의 크기가 바뀌게 되는데, 그 크기를 알 수 없어서 List를 사용했다. List가 크기 조정에 유연하기 때문이다. 
//        String[] answer = new String[strArr.length];
//        
//        for (int i = 0; i < strArr.length; i++) {
//               answer[i] = strArr[i].replaceAll("ad", "");
//        }
    	List<String> answer = new ArrayList();
        for(int i = 0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                answer.add(strArr[i]);
            }
        }
        return answer;
    }
}
