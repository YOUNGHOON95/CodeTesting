package programers.practice;

public class Day45 {
	/*
	 * 문제 설명
		문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
		
		입출력 예
			my_string			n		result
			"ProgrammerS123"	11		"ProgrammerS"
			"He110W0r1d"		5		"He110"
			
		입출력 예
			입출력 예 #1
			
			예제 1번의 my_string에서 앞의 11글자는 "ProgrammerS"이므로 이 문자열을 return 합니다.
			입출력 예 #2
			
			예제 2번의 my_string에서 앞의 5글자는 "He110"이므로 이 문자열을 return 합니다.
	 */

    public String main(String my_string, int n) {
        //문자열 my_string 앞에서 n 만큼 자르고 리턴
        String answer = "";
        answer = my_string.substring(0,n);
        
        return answer;
    }
}