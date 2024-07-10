package programers.practice;

import java.util.Arrays;

public class Day63 {
	/*
	 * 문제 설명
		정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
		단, arr에 2가 없는 경우 [-1]을 return 합니다.
		
		입출력 예
			arr								result
			[1, 2, 1, 4, 5, 2, 9]			[2, 1, 4, 5, 2]
			[1, 2, 1]						[2]
			[1, 1, 1]						[-1]
			[1, 2, 1, 2, 1, 10, 2, 1]		[2, 1, 2, 1, 10, 2]
		입출력 예 #1
			2가 있는 인덱스는 1번, 5번 인덱스뿐이므로 1번부터 5번 인덱스까지의 부분 배열인 [2, 1, 4, 5, 2]를 return 합니다.
		입출력 예 #2
			2가 한 개뿐이므로 [2]를 return 합니다.
		입출력 예 #3
			2가 배열에 없으므로 [-1]을 return 합니다.
		입출력 예 #4
			2가 있는 인덱스는 1번, 3번, 6번 인덱스이므로 1번부터 6번 인덱스까지의 부분 배열인 [2, 1, 2, 1, 10, 2]를 return 합니다.
		=> for문으로 2의 인덱스 값을 구한 다음 그 범위안 배열을 꺼낸다
	 */
    public int[] main(int[] arr) {
        int firstIndex = 100000, lastIndex = 0;
        
        for(int i = 0 ; i < arr.length ; i++) {
        	if(arr[i] == 2) {
        		//2의 갯수의 인덱스 구하는 방법....
        		firstIndex = Math.min(firstIndex, i);
                lastIndex = Math.max(lastIndex, i);
        	}
        }
        	//예3번 2가 배열에 없을경우 else문
        if (firstIndex <= lastIndex) {
            return Arrays.copyOfRange(arr, firstIndex, lastIndex + 1);
        } else {    //  그렇지 않다면 {-1}을 반환
            return new int[]{-1};
        }
        
    }
}
