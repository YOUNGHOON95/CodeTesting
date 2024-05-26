package programers.practice;

public class Day29 {
	/*
	 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.

		각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
		
		각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
		단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.
		
				
				
		입출력 예
		arr					queries								result
		[0, 1, 2, 4, 3]		[[0, 4, 2],[0, 3, 2],[0, 2, 2]]		[3, 4, -1]
		
		=> 2차원배열 [[s e k] ,[s e k] , [s e k]] // [0,0] => s [0,1] => e [0,3] => k 이런 식
		 	1차 for문으로 2차원배열 안에 있는 배열을 구한다         for(int i=0;i<queries.length;i++){
		 	2차 for문으로 s 에서 e 까지 k보다 크면서 가장 작은 수 구 하기             for(int j=s;j<=e;j++){
		 	
		 	
	 */
	public int[] main(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int min = Integer.MAX_VALUE;
            for(int j=s;j<=e;j++){
                if(k<arr[j]){
                    min = Math.min(min,arr[j]);
                }
            }
            if(min==Integer.MAX_VALUE){
                min = -1;
            }
            answer[i] = min;
        }
        return answer;
    }
}
