package programers.practice;

public class Day23 {
	/*
	 * 정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
	 * 
	 *	num_list			result
		[3, 4, 5, 2, 1]		1
		[5, 7, 8, 3]		0
		
		=> 배열의 합은 반복문으로 합과 곱 구하기 
	 */
	public int main(int[] num_list) {
		int answer = 0;
		int sum = 0;
		int mul = 1;
        
        for(int i = 0 ; i < num_list.length ; i++){
        	mul *= num_list[i];
            sum += num_list[i];
            
//            if(sum * sum > mul){
//                answer = 1;
//            }else{
//                answer = 0;
//            }
//            
            answer = (sum * sum) > mul ? 1 : 0;
            
        }
        return answer;
    }
}