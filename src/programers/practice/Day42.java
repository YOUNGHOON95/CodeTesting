package programers.practice;

public class Day42 {
	/*
	 * 문제 설명
		문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
		
		
		입출력 예
			my_string			n		result
			"ProgrammerS123"	11		"grammerS123"
			"He110W0r1d"		5		"W0r1d"
			
		입출력 예
			입출력 예 #1
			
			예제 1번의 my_string에서 뒤의 11글자는 "grammerS123"이므로 이 문자열을 return 합니다.
			
			입출력 예 #2
			
			예제 2번의 my_string에서 뒤의 5글자는 "W0r1d"이므로 이 문자열을 return 합니다.	
			
		=> 뒤에서? 부터 짜르는 방법이 있나 찾아 보다가 -n 방법을 찾게 되었다
	 */
    public String main(String my_string, int n) {
        String answer = "";
      
        answer = my_string.substring(my_string.length()-n, my_string.length());
        
        return answer;
    }
}
