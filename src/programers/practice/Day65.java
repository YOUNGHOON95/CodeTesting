package programers.practice;

public class Day65 {
	/*
	 * 문제 설명
		정수 리스트 num_list가 주어집니다. 
		가장 첫 번째 원소를 1번 원소라고 할 때, 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 
		return 하도록 solution 함수를 완성해주세요. 두 값이 같을 경우 그 값을 return합니다.
		
		입출력 예
			num_list				result
			[4, 2, 6, 1, 7, 6]		17
			[-1, 2, 5, 6, 3]		8
			
		입출력 예 #1
			홀수 번째 원소들의 합은 4 + 6 + 7 = 17, 짝수 번째 원소들의 합은 2 + 1 + 6 = 9 이므로 17을 return합니다.
		입출력 예 #2
			홀수 번째 원소들의 합은 -1 + 5 + 3 = 7, 짝수 번째 원소들의 합은 2 + 6 = 8 이므로 8을 return합니다.
			
		=> 1.for문으로 num_list 반복해서 2. 인덱스가 짝수 홀수 일때 조건문 만들고 3. 그 다음 두 값을 비교한 값 리턴
	 */
    public int main(int[] num_list) {
        int answer = 0;
        int a = 0;
        int b = 0;
        for(int i = 0; i < num_list.length ; i++){
            if(i % 2 == 0){
                a += num_list[i];
            }else{
                b += num_list[i];
            }
            if(a > b){
                answer = a;
            }else{
                answer = b;
            }
            //answer = (a > b) ? a : b;
        }
        
        return answer;
    }
}
