package programers.practice;
import java.util.*;

public class Day89 {
	/*
	 * 문제 설명
		아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 길이가 같은 정수 배열 arr과 boolean 배열 flag가 매개변수로 주어질 때, 
		flag를 차례대로 순회하며 flag[i]가 true라면 X의 뒤에 arr[i]를 arr[i] × 2 번 추가하고, 
		flag[i]가 false라면 X에서 마지막 arr[i]개의 원소를 제거한 뒤 X를 return 하는 solution 함수를 작성해 주세요.
	   
	   입출력 예
		arr				flag								esult
		[3, 2, 4, 1, 3]	[true, false, true, false, false]	[3, 3, 3, 3, 4, 4, 4, 4]
		
		
		입출력 예 #1
			예제 1번에서 X의 변화를 표로 나타내면 다음과 같습니다
			|0|true|3|[3, 3, 3, 3, 3, 3]|
			
			|1|false|2|[3, 3, 3, 3]|
			
			|2|true|4|[3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4]|
			
			|3|false|1|[3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4]|
			
			|4|false|3|[3, 3, 3, 3, 4, 4, 4, 4]|
			
		=> 1.반복문으로 index의 배열 찾아서 2. flag가 참인지 거짓인지 구분해서 3.각각의 값으로 리턴해준다
	 */
    public List<Integer> main(int[] arr, boolean[] flag) {
        //int[] answer = {};
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(!flag[i]){
                //거짓
                for (int k = 0; k < arr[i]; k++) {
                    answer.remove(answer.size() - 1);
                }
            }else{
                //참
                for (int j = 0; j < arr[i] * 2; j++) {
                    answer.add(arr[i]);
                }
                
            }
        }
        return answer;
    }
}
