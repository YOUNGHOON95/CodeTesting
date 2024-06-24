package programers.practice;

import java.util.ArrayList;
import java.util.List;

public class Day51 {
	/*
	 * 문제 설명
		정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
		
		입출력 예
			n	k	result
			10	3	[3, 6, 9]
			15	5	[5, 10, 15]

		입출력 예 설명
			입출력 예 #1
			-1 이상 10 이하의 3의 배수는 3, 6, 9 이므로 [3, 6, 9]를 return 합니다.
			
			입출력 예 #2
			-1 이상 15 이하의 5의 배수는 5, 10, 15 이므로 [5, 10, 15]를 return 합니다.
	 */
	
    public List<Integer> main(int n, int k) {
        List<Integer> answer = new ArrayList();

        for(int i = 1 ; i <= n ; i++){
            if(i % k == 0){
                answer.add(i);
            }
        }
        return answer;
        //return answer.stream().mapToInt(List<Integer>::listValue).toArray(); => List 객체는 스트림으로 (X)...? 한번 찾아보겠습니다
    }
}