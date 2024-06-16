package programers.practice;

public class Day47 {
	/*
	 * 문제 설명
		문자열 my_string과 정수 s, e가 매개변수로 주어질 때, my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
		
		
	   입출력 예
		my_string			s	e		result
		"Progra21Sremm3"	6	12		"ProgrammerS123"
		"Stanley1yelnatS"	4	10		"Stanley1yelnatS"
		
		입출력 예 #1
		예제 1번의 my_string에서 인덱스 6부터 인덱스 12까지를 뒤집은 문자열은 "ProgrammerS123"이므로 "ProgrammerS123"를 return 합니다.
		
		입출력 예 #2
		예제 2번의 my_string에서 인덱스 4부터 인덱스 10까지를 뒤집으면 원래 문자열과 같은 "Stanley1yelnatS"이므로 "Stanley1yelnatS"를 return 합니다.
	 */
    public String solution(String my_string, int s, int e) {
        String answer = "";
        answer += my_string.substring(0,s); // 0에서 시작해서 s 전까지 
        for (int i=e; i>=s; i--){
            answer += my_string.charAt(i);
        }
        answer += my_string.substring(e+1); // e+1에서 시작해서 끝까지
        return answer;
        
        //reverse() 함수 이용 하는 방법도 있다.....
        
    }
}
