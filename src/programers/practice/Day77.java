package programers.practice;

public class Day77 {
	/*
	 * 문제 설명
		단어가 공백 한 개로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
	   입출력 예
		my_string		result
		"i love you"	["i", "love", "you"]
		"programmers"	["programmers"]
		
		입출력 예 #1
			예제 1번의 my_string은 "i love you"로 공백 한 칸으로 나누어진 단어들은 앞에서부터 순서대로 "i", "love", "you" 이므로 ["i", "love", "you"]를 return 합니다.
		입출력 예 #2
			예제 2번의 my_string은 "programmers"로 단어가 하나만 있습니다. 따라서 ["programmers"]를 return 합니다
			
		=>1.문제 보자 생각난게 공백 기준 자르기 생각남 2.substring 이랑 split가 떠올랐지만 여기서는 split가 더 맞다고 판단하였다
	 */
    public String[] main(String my_string) {
        String[] answer = {};
        answer = my_string.split(" ");
        return answer;
    }
}
