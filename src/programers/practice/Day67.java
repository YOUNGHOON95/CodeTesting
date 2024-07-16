package programers.practice;

import java.util.ArrayList;
import java.util.List;

public class Day67 {
	/*
	 * 문제 설명
		최대 5명씩 탑승가능한 놀이기구를 타기 위해 줄을 서있는 사람들의 이름이 담긴 문자열 리스트 names가 주어질 때, 
		앞에서 부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 리스트를 return하도록 solution 함수를 완성해주세요. 
		마지막 그룹이 5명이 되지 않더라도 가장 앞에 있는 사람의 이름을 포함합니다.
		
		
		입출력 예
			names															result
			["nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"]		["nami", "vex"]
			
		입출력 예 #1
			앞에서부터 5명씩 두 그룹으로 묶을 수 있습니다. 
			["nami", "ahri", "jayce", "garen", "ivern"], ["vex", "jinx"] 이 두 그룹에서 가장 앞에 서있는 사람들의 이름을 담은 리스트인 ["nami", "vex"]를 return합니다.
		
		=> 1.name배열 반복문 길이만큼 돌린다 2.5로 나누었을때 즉 5명씩 묶어야 하기때문에 조건문 사용 3.add을 이용해 배열(리턴)에 넣어주기
	 */
    public String[] main(String[] names) {
        //String[] answer = {};
        List<String> answer = new ArrayList();
        for(int i= 0 ; i < names.length; i++){
            if(i % 5 == 0) {
                answer.add(names[i]);
            }
        }
        return answer.toArray(new String[answer.size()]);
        //return answer;
    }
}