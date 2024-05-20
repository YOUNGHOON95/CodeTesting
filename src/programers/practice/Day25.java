package programers.practice;


public class Day25 {
	/*
	 * 정수 리스트 num_list가 주어질 때, 
	 * 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 
	 * 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 
	 * return하도록 solution 함수를 완성해주세요.
	 * 
	 * 
		입출력 예
		num_list			result
		[2, 1, 6]			[2, 1, 6, 5]
		[5, 2, 1, 7, 5]		[5, 2, 1, 7, 5, 10]
		
		=> 배열의 원소 추가 할때 여러가지 방법이 있는데 난 list로 넣는 방법을 선택했다(주석처리... ) 27번째 줄 newList.add(num_list[num_list.length - 1] - num_list[num_list.length - 2]);
		이부분 Type mismatch: cannot convert from boolean to int / boolean이 왜 나오는지 모르겠다.,..
	 */
	public int[] main(int[] num_list) {
//        int[] answer = {};
//        List<Integer> newList = new ArrayList<>();
//        
//        for(int i = 0 ;  i < num_list.length ; i++) {
//        	if(num_list[num_list.length - 1] > num_list[num_list.length - 2] ) {
//        		answer[num_list.length]	= newList.add(num_list[num_list.length - 1] - num_list[num_list.length - 2]);
//        	}else {
//        		newList.add( 2 * num_list[i]);
//        	}
//        }
        int[] answer = new int[num_list.length+1]; //==>> answer = new int[n+1]을 선언해주지 않음. 즉 answer라는 배열에 공간을 할당해주지 않았음. 최대난제...
        for (int i=0; i<num_list.length; i++) {
            answer[i] = num_list[i];
            if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
                answer[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
            } else {
                answer[num_list.length] = num_list[num_list.length - 1] * 2;
            }
        }
        
        return answer;
    }
}