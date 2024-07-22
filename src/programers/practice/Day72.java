package programers.practice;

public class Day72 {
	/*
	 * 문제 설명
		정수가 담긴 리스트 num_list가 주어질 때, 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.
		
		입출력 예
			num_list									result
			[3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1]		51
			[2, 3, 4, 5]								120
		
		입출력 예 #1
			리스트의 길이가 13이므로 모든 원소의 합인 51을 return합니다.
		입출력 예 #2
			리스트의 길이가 4이므로 모든 원소의 곱인 120을 return합니다.
			
		=> 1.배열의 길이가 11이상과 10이하로 나눈다 2. 각각 합일때 곱일때 반복문 *answer = 1 안해주면 계속 0이 나옴
	 */
    public int main(int[] num_list) {
        //리스트 길이가 11이상 합 10이하면 곱
        int answer = 0;
        if(num_list.length >= 11){
            for(int i = 0; i < num_list.length; i++){
                answer += num_list[i];
            }
        }else if(num_list.length <= 10){
             answer = 1;
            for(int i = 0; i < num_list.length; i++){
                answer *= num_list[i];
            } 
        }
        return answer;
    }
}