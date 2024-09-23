package programers.practice;
import java.util.*;

public class Day97 {
	/*
	 * 문제 설명
		정수로 이루어진 리스트 num_list가 주어집니다. 
		num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
		
	   입출력 예
		num_list								result
		[12, 4, 15, 46, 38, 1, 14, 56, 32, 10]	[15, 32, 38, 46, 56]
		
		
	   입출력 예 #1
		[12, 4, 15, 46, 38, 1, 14, 56, 32, 10]를 정렬하면 [1, 4, 10, 12, 14, 15, 32, 38, 46, 56]이 되고, 
		앞에서 부터 6번째 이후의 수들을 고르면 [15, 32, 38, 46, 56]가 됩니다.
		
		-> 1. LIST로 풀고 싶었다
		   2. LIST 선언해주고 정렬 해줬다
		   3. 그리고 가장 작은 5개의 수 제외한 배열을 뽑았다
	 */
    public List solution(int[] num_list) {
        
        List<Integer> answer = new ArrayList<>();
        
        Arrays.sort(num_list);
        
        for (int i = 5; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }
        
        return answer;
    }
}

