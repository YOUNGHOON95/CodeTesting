package programers.practice;

public class Day32 {
	/*
	 * 정수 start_num와 end_num가 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
	 * 
	 * 입출력 예
		start_num	end_num		result
		3			10			[3, 4, 5, 6, 7, 8, 9, 10]
		
		=>
	 */
    public int[] main(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        //ArrayList<Integer> list = new ArrayList<Integer>();
        //for(int i = strart_num ; i <= end_num ; i++){
            //i값이배열에 들어가야 할 로직 i
        //    list.add(i);
        //}
        for(int i = 0 ; i <= end_num - start_num ; i++){
           answer[i] = i + start_num;
        }
        return answer;
        
        /*
         *    public List<Integer> solution(int start, int end) {    
        List<Integer> answerList = new ArrayList();        

        for(int i = start; i <= end; i++) {
            answerList.add(i);
        }
        return answerList;
    }
}
  			=> LIST 로도 풀러보려고 했는데 잘 안됬다 
         */ 
        
        
    }
}
