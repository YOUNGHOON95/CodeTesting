package programers.practice;

public class Day15 {
	/*
	 * 정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.
	 * 
	 * 
	 * 입출력 예
		num		n	result
		98		2	1
		34		3	0
		
		
		=> 배수 구하는 방법 나머지가 0인 수를 찾으면 된다
		
	 */
	public int main(int num, int n) {
        int answer = num % n == 0 ? 1 : 0; 
        return answer;
        
        //if(num % n == 0 ){
       //     return 1; 
       // }else{
      //      return answer;
      //  }
        
    }

}
