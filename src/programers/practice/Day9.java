package programers.practice;

public class Day9 {
	/*문자열 my_string, overwrite_string과 정수 s가 주어집니다. 
	 * 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 
	 * 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
	 * 
	 * 입출력 예 #1
	 * 예제 1번의 my_string에서 인덱스 2부터 overwrite_string의 길이만큼에 해당하는 부분은 "11oWor1"이고 이를 "lloWorl"로 바꾼 "HelloWorld"를 return 합니다.
	 * 입출력 예 #2
	 * 예제 2번의 my_string에서 인덱스 7부터 overwrite_string의 길이만큼에 해당하는 부분은 "29b8UYP"이고 이를 "merS123"로 바꾼 "ProgrammerS123"를 return 합니다.
	 * 
	 * 
	 * => substring으로 짜르고 붙일 생각을 해봤다.. 다른 사람 코딩보고 더 깔끔하게 하는 법을 알았다..
	 * 	String before = my_string.substring(0, s);
	 *  String after = my_string.substring(s + overwrite_string.length());
	 *  return before + overwrite_string + after;
	 * 
	 */
	
	public String solution(String my_string, String overwrite_string, int s) {
		String answer = "";
        int a = my_string.length();
        int b = overwrite_string.length();
        String c = my_string.substring(0, s);
        String d = my_string.substring((s+b), a);
        answer += c + overwrite_string + d;
        return answer;
	    }
}
