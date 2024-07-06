package programers.practice;

public class Day60 {
	/*
	 * 문제 설명
		정수 리스트 num_list와 정수 n이 주어질 때, 
		num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠
		n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
		 
		입출력 예
			num_list			n		result
			[2, 1, 6]			1	[1, 6, 2]
			[5, 2, 1, 7, 5]		3	[7, 5, 5, 2, 1]
		입출력 예 #1
			[2, 1, 6]에서 첫 번째 이후의 원소는 [1, 6]이고 첫 번째까지의 원소는 [2]입니다. 두 리스트를 이어 붙이면 [1, 6, 2]가 됩니다.
		입출력 예 #2
			[5, 2, 1, 7, 5]에서 세 번째 이후의 원소는 [7, 5]이고 세 번째까지의 원소는 [5, 2, 1]입니다. 두 리스트를 이어 붙이면 [7, 5, 5, 2, 1]가 됩니다.
		
		=>1.배열 정의 2.n의값은 index값이 아니니 -1 생각 3. n 뒤에부터 배열 저장 4.그 이후 n 앞에 배열 저장 
	 */
    public int[] main(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int idx = 0;
        
        //n부터 num_list까지 일단 우선 배열에 저장
        for(int i=0; i < num_list.length-n; i++){
            answer[i]=num_list[n+i];
        }//0부터 n까지 뒤에다 저장
        for(int i=num_list.length-n; i < num_list.length; i++){
            answer[i]=num_list[idx++];
        }
        return answer;
    }
}
