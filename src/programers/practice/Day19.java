package programers.practice;

public class Day19 {
	/*
	 * 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.
	 * 
	 *	 a	b	flag	result
		-4	7	true	3
		-4	7	false	-11
	 * 
	 * 
	 * => 참 거짓 조건을 이용해서 삼항연산자 까지 해봣다
	 * 
	 */
	
	public int main(int a, int b, boolean flag) {
		   int answer = 0;
	        
	        //if(flag == true){
	        //    answer = a + b;
	        //}else{
	        //    answer = a - b;
	        //}
	        
	        answer = flag  ? a + b : a - b;
	        
	        return answer;
	}

}
