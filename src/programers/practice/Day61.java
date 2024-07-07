package programers.practice;

public class Day61 {
	/*
	 * 문제 설명
		정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
		
		입출력 예
			num_list			n	result
			[2, 1, 6]			1	[2]
			[5, 2, 1, 7, 5]		3	[5, 2, 1]
		입출력 예 #1
			[2, 1, 6]의 첫 번째 원소부터 첫 번째 원소까지의 모든 원소는 [2]입니다.
		입출력 예 #2
			[5, 2, 1, 7, 5]의 첫 번째 원소부터 세 번째 원소까지의 모든 원소는 [5, 2, 1]입니다.
		
		=> 1.for문으로 n만큼 돌려주고 i만큼 answer에 넣어준다
			*놓친부분 1. 배열 크기 선언 answer = new int[n]; 2.answer도 배열이라 배열 정의  answer[i] = num_list[i];
	 */
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = new int[n];
        
        for(int i = 0 ; i < n  ; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}
