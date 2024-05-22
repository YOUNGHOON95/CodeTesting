package programers.practice;

public class Day26 {
	/*
	 * 	정수 n과 문자열 control이 주어집니다. control은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며, control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꿉니다.
	
		"w" : n이 1 커집니다.
		"s" : n이 1 작아집니다.
		"d" : n이 10 커집니다.
		"a" : n이 10 작아집니다.
		위 규칙에 따라 n을 바꿨을 때 가장 마지막에 나오는 n의 값을 return 하는 solution 함수를 완성해 주세요.
		
		입출력 예
		n	control			result
		0	"wsdawsdassw"	-1
		
		=> 제일 먼저 손이 갔던 코딩 이해하자마자 떠오른...
			== 다른 사람 풀이 중에 swich문 사용한 방법과  charAt() 대신 String[] abc = control.split("") 배열을 split으로 문자열 비교 equals로
				푼 문제를 보고 다양한 방법 알게 됨

		
	*/
	public int main(int n, String control) {
        int answer = n;
        for(int i = 0; i < control.length(); i++){
           char c = control.charAt(i);
            if(c == 'w'){
                 answer += 1;
            }else if(c == 's'){
                answer -= 1;
            }else if(c == 'd'){
                 answer += 10;
            }else{
                answer -= 10;
            }
        }
        
        return answer;
    }
}