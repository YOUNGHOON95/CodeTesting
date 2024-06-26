package programers.practice;

import java.util.ArrayList;

public class Day53 {
	/*
	 * 문제 설명
		정수 start_num와 end_num가 주어질 때, start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
		
		입출력 예
			start_num		end_num			result
			10				3				[10, 9, 8, 7, 6, 5, 4, 3]
		
		입출력 예 #1
			10부터 3까지 1씩 감소하는 수를 담은 리스트는 [10, 9, 8, 7, 6, 5, 4, 3]입니다.
		
		= 배열을 만들어서 for문에 하나씩 넣어주었다
	 */
    public ArrayList<Integer> main(int start_num, int end_num) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i = start_num ; i >= end_num ; i--){
            answer.add(i);
        }
        
        return answer;
    }
}
