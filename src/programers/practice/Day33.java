package programers.practice;
import java.util.ArrayList;
import java.util.List;

public class Day33 {
	/*
	 * 모든 자연수 x에 대해서 현재 값이 x이면 x가 짝수일 때는 2로 나누고, x가 홀수일 때는 3 * x + 1로 바꾸는 계산을 계속해서 반복하면 언젠가는 반드시 x가 1이 되는지 묻는 문제를 콜라츠 문제라고 부릅니다.

		그리고 위 과정에서 거쳐간 모든 수를 기록한 수열을 콜라츠 수열이라고 부릅니다.
		
		계산 결과 1,000 보다 작거나 같은 수에 대해서는 전부 언젠가 1에 도달한다는 것이 알려져 있습니다.
		
		임의의 1,000 보다 작거나 같은 양의 정수 n이 주어질 때 초기값이 n인 콜라츠 수열을 return 하는 solution 함수를 완성해 주세요.
		
		
		입출력 예 #1
			
			순서대로 연산한 결과를 표로 만들면 다음과 같습니다.
			연산 		횟수	x	홀짝 여부
			0		10		짝수
			1		5		홀수
			2		16		짝수
			3		8		짝수
			4		4		짝수
			5		2		짝수
			6		1		홀수
			따라서 [10, 5, 16, 8, 4, 2, 1]을 return 합니다.
	 */
    public int[] main(int n) {
        //배열 크기를 어떻게 해야할까... (고민1) => LIST로 해보자,....
        //int[] answer = {}
        List<Integer> list = new ArrayList<>();
        list.add(n);
        //반복문 돌리는데 언제까지 돌려야 하나,,, ex) i < n; (고민2) => 고민끝에 While문으로... for문 아닌가 보다...
        /*for(int i = 0 ; i < n; i++){ 
            if(n % 2 == 0){
                answer[i] = n / 2;
            }else{
               answer[i] = 3 * n + 1 ;
            }
        }
        */
        //짝수일 때는 2로 나누고, n % 2 == 0일 때 n / 2 
        //홀수일 때는 3 * x + 1  n % 2 != 0일 때 3*n+1 
        while(n != 1) {
             if(n % 2 == 0) {
                     n /=  2;
                } else {
                   n = 3 * n + 1 ;
                }
                list.add(n);
        }
        
        ///////////////////////////////////////////////////
        int[] answer = new int[list.size()];
         for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        /* 이 부분 스트림....
         * 
         * List 하나 더 만들어서 
         *         List<Integer> answerlist = new ArrayList<>();
         *         return answerlist.stream()
					              .maptoInt(Integer::intValue)
					              .toArray();

         */
        
        
        return answer;
    }
}
