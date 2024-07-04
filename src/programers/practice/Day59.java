package programers.practice;

public class Day59 {
	/*
	 * 문제 설명
		정수 리스트 num_list와 정수 n이 주어질 때, n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
		
		입출력 예
			num_list			n		result
			[2, 1, 6]			3		[6]
			[5, 2, 1, 7, 5]		2		[2, 1, 7, 5]
		
		입출력 예 #1
			[2, 1, 6]의 세 번째 원소부터 마지막 원소까지의 모든 원소는 [6]입니다.
		입출력 예 #2
			[5, 2, 1, 7, 5]의 두 번째 원소부터 마지막 원소까지의 모든 원소는 [2, 1, 7, 5]입니다.
		
		=>1.배열 크기 구하고 2. for문으로 result값 넣어주기 *Arrays.copyOfRange함수 사용도 가능
	 */
    public int[] main(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];

        for(int i = n-1; i < num_list.length; i++){
            answer[i-(n-1)] = num_list[i]; 
        }
        return answer;
//      return Arrays.copyOfRange(num_list, n-1, num_list.length);

    }
}