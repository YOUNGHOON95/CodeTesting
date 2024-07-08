package programers.practice;
import java.util.*;

public class Day62 {
	/*
	 * 문제 설명
		정수 리스트 num_list와 정수 n이 주어질 때, 
		num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
	
	   입출력 예
		num_list				n	result
		[4, 2, 6, 1, 7, 6]		2	[4, 6, 7]
		[4, 2, 6, 1, 7, 6]		4	[4, 7]
	
		입출력 예 #1
			[4, 2, 6, 1, 7, 6]에서 2개 간격으로 저장되어 있는 원소들은 [4, 6, 7]입니다.
		입출력 예 #2
			[4, 2, 6, 1, 7, 6]에서 4개 간격으로 저장되어 있는 원소들은 [4, 7]입니다.
		
		=> 1.List로 풀어보도록 생각 2.for문에 i++ 자리에 n 만큼 증가하도록 생각
		
	 */
    public List solution(int[] num_list, int n) {
        
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < num_list.length; i+=n) {
            answer.add(num_list[i]);
        }
        
        return answer;
    }
}