package programers.practice;

public class Day28 {
	/*
	 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.

		각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
		
		위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
		
		
		입출력 예
		arr					queries						result
		[0, 1, 2, 3, 4]		[[0, 3],[1, 2],[1, 4]]		[3, 4, 1, 0, 2]
		
		
		=> 배열의 위치 바꾸기 temp 와 swap //2차원? 0행0열 0행1열 0행2열?
		=> 해답 후 => 2차원이 아니라 [0,3]이 인덱스 = 0?
		=> temp는 임시저장 이라 생각해서 이해는 했지만 query부분이 이해가 잘 안됨
	 */
    public int[] main(int[] arr, int[][] queries) {
//        int[] answer = new int[arr.length+1];
//        
//        
//        
//        
//        return answer;
        
        for(int[] query : queries) {
            int temp = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = temp;
        }
        return arr;
    }
}
