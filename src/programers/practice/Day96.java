package programers.practice;
import java.util.Arrays;

public class Day96 {
	/*
	 * 문제 설명
		정수로 이루어진 리스트 num_list가 주어집니다. 
		num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
		
		입출력 예
			num_list						result
			[12, 4, 15, 46, 38, 1, 14]		[1, 4, 12, 14, 15]
		
		입출력 예 #1
			[12, 4, 15, 46, 38, 1, 14]를 정렬하면 [1, 4, 12, 14, 15, 38, 46]이 되고, 앞에서 부터 5개를 고르면 [1, 4, 12, 14, 15]가 됩니다.
			
		=> 1.먼저 int[]에 정렬을 하고 2.answer만큼 배열에 넣어주면 된다
		
	 */

    public int[] main(int[] num_list) {
        int[] answer = new int[5];

        Arrays.sort(num_list);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}