package programers.practice;
import java.util.*;

public class Day91 {
	/*
	 * 문제 설명
		0과 1로만 이루어진 정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk을 만드려고 합니다.
		i의 초기값을 0으로 설정하고 i가 arr의 길이보다 작으면 다음을 반복합니다.
		만약 stk이 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
		stk에 원소가 있고, stk의 마지막 원소가 arr[i]와 같으면 stk의 마지막 원소를 stk에서 제거하고 i에 1을 더합니다.
		stk에 원소가 있는데 stk의 마지막 원소가 arr[i]와 다르면 stk의 맨 마지막에 arr[i]를 추가하고 i에 1을 더합니다.
		위 작업을 마친 후 만들어진 stk을 return 하는 solution 함수를 완성해 주세요.
		단, 만약 빈 배열을 return 해야한다면 [-1]을 return 합니다.
	   
	   입출력 예
		arr					result
		[0, 1, 1, 1, 0]		[0, 1, 0]
		[0, 1, 0, 1, 0]		[0, 1, 0, 1, 0]
		[0, 1, 1, 0]		[-1]	
		
		입출력 예 #1
			idx	arr[idx]	stk
			0	0			[]
			1	1			[0]
			2	1			[0, 1]
			3	1			[0]
			4	0			[0, 1]
			5	-			[0, 1, 0]
			따라서 [0, 1, 0]을 return 합니다.
			
			입출력 예 #2
			각 작업을 마친 후에 배열의 변화를 나타내면 다음 표와 같습니다.
			idx		arr[idx]	stk
			0		0			[]
			1		1			[0]
			2		0			[0, 1]
			3		1			[0, 1, 0]
			4		0			[0, 1, 0, 1]
			5		-			[0, 1, 0, 1, 0]
			따라서 [0, 1, 0, 1, 0]을 return 합니다.
			
			입출력 예 #3
			각 작업을 마친 후에 배열의 변화를 나타내면 다음 표와 같습니다.
			idx		arr[idx]	stk
			0		0			[]
			1		1			[0]
			2		1			[0, 1]
			3		0			[0]
			4		-			[]
			마지막에 빈 배열이 되었으므로 [-1]을 return 합니다.
			
		=> ** 1.빈 배열을 return 해야한다면 [-1]을 리턴
		   ** 2.만약 stk이 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다. stk에 원소가 있고, 3.stk의 마지막 원소가 arr[i]와 같으면 stk의 마지막 원소를 stk에서 제거하고 i에 1을 더합니다.
		   ** 4.stk에 원소가 있는데 stk의 마지막 원소가 arr[i]와 다르면 stk의 맨 마지막에 arr[i]를 추가하고 i에 1을 더합니다.
		   조건 잘 파악해서
		   1.List의 add 와 remove를 이용해서 정리 2.반복문을 통해서 계속 비교(if)해서 배열 구하고 3.빈배열 일때는 -1리턴 해주기
	 */
    public List<Integer> main(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < arr.length){
            if(list.size() == 0)
                list.add(arr[i]);
            else if(list.get(list.size() - 1) == arr[i])
                list.remove(list.size() - 1);
            else
                list.add(arr[i]);

            i ++;
        }
        if(list.size() == 0)
            list.add(-1);

        return list;
    }
}
