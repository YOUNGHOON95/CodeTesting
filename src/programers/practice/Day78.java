package programers.practice;

public class Day78 {
	/*
	 * 문제 설명
		단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때,
		 my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
		 
		입출력 예
			my_string				result
			" i    love  you"		["i", "love", "you"]
			"    programmers  "		["programmers"]
		
		입출력 예 #1
			예제 1번의 my_string은 " i    love  you"로 공백을 기준으로 단어를 나누면 "i", "love", "you" 3개의 단어가 있습니다. 따라서 ["i", "love", "you"]를 return 합니다.
		입출력 예 #2
			예제 2번의 my_string은 "    programmers  "로 단어는 "programmers" 하나만 있습니다. 따라서 ["programmers"]를 return 합니다.
			
		=>*주석을 친 부분으로 채점을 했더니 실패오류가 떠서 이유를 찾아보니 아래와 같은 이유 때문에 "\\s+"로 잡아줘야 한다
	 */
    public String[] main(String my_string) {
        //split(" "): 연속된 공백문자가 아니라, 
        //공백 문자 하나(" ")를 구분자로 사용하여 분할
        //(\\s+): 연속된 공백문자를 구분자로 인식하여 분할
        String[] answer = {};
        //answer = my_string.trim().split("");
        answer = my_string.trim().split("\\s+");
        return answer;
    }
}